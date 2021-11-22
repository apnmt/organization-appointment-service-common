package de.apnmt.organizationappointment.common.service;

import de.apnmt.organizationappointment.common.domain.Appointment;
import de.apnmt.organizationappointment.common.domain.ClosingTime;
import de.apnmt.organizationappointment.common.domain.OpeningHour;
import de.apnmt.organizationappointment.common.domain.WorkingHour;
import de.apnmt.organizationappointment.common.domain.enumeration.Day;
import de.apnmt.organizationappointment.common.repository.*;
import de.apnmt.organizationappointment.common.service.dto.SlotDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AvailabilityService {

    private final ClosingTimeRepository closingTimeRepository;
    private final OpeningHourRepository openingHourRepository;
    private final ServiceRepository serviceRepository;
    private final WorkingHourRepository workingHourRepository;
    private final AppointmentRepository appointmentRepository;

    public AvailabilityService(ClosingTimeRepository closingTimeRepository, OpeningHourRepository openingHourRepository, ServiceRepository serviceRepository, WorkingHourRepository workingHourRepository, AppointmentRepository appointmentRepository) {
        this.closingTimeRepository = closingTimeRepository;
        this.openingHourRepository = openingHourRepository;
        this.serviceRepository = serviceRepository;
        this.workingHourRepository = workingHourRepository;
        this.appointmentRepository = appointmentRepository;
    }

    public SlotDTO findAvailableSlots(LocalDate date, Long serviceId, Long organizationId, Long employeeId) {
        List<OpeningHour> openingHours = this.openingHourRepository.findAllByOrganizationId(organizationId);
        Optional<de.apnmt.organizationappointment.common.domain.Service> service = this.serviceRepository.findById(serviceId);
        if (service.isEmpty()) {
            throw new RuntimeException();
        }
        Day day = Day.getDay(date.getDayOfWeek());
        int duration = service.get().getDuration();
        List<LocalTime> slots = getSlots(getOpeningHours(openingHours, day), duration, date);

        List<ClosingTime> closingTimes = this.closingTimeRepository.findAllByOrganizationId(organizationId);
        closingTimes = filterClosingTimes(closingTimes, date);
        slots = filterSlotsByClosingTimes(slots, closingTimes);

        slots = filterSlotsByWorkingHours(slots, employeeId, date);

        List<Appointment> appointments;
        LocalDateTime start = LocalDateTime.of(date, LocalTime.of(0, 0));
        LocalDateTime end = start.plusDays(1);
        appointments = this.appointmentRepository.findAllByOrganizationIdAndEmployeeIdAndStartAtAfterAndEndAtBefore(organizationId, employeeId, start, end);

        slots = filterSlotsByAppointments(slots, appointments, duration);

        SlotDTO slot = new SlotDTO();
        slot.setTimes(slots);
        slot.setDate(date);
        return slot;
    }

    private List<LocalTime> filterSlotsByAppointments(List<LocalTime> slots, List<Appointment> appointments, int duration) {
        List<LocalTime> removeSlots = new ArrayList<>();
        for (Appointment appointment : appointments) {
            LocalTime start = appointment.getStartAt().toLocalTime();
            LocalTime end = appointment.getEndAt().toLocalTime();
            for (LocalTime slot : slots) {
                LocalTime endTime = slot.plusMinutes(duration);
                if (slot.equals(start) || (slot.isAfter(start) && slot.isBefore(end)) || (endTime.isAfter(start) && endTime.isBefore(end))) {
                    removeSlots.add(slot);
                }
            }
        }
        slots.removeAll(removeSlots);
        return slots;
    }


    private List<LocalTime> filterSlotsByWorkingHours(List<LocalTime> slots, Long employeeId, LocalDate date) {
        List<LocalTime> removeSlots = new ArrayList<>();
        LocalDateTime start = LocalDateTime.of(date, LocalTime.of(0, 0));
        LocalDateTime end = start.plusDays(1);
        List<WorkingHour> workingHours = this.workingHourRepository.findAllByEmployeeIdAndStartAtAfterAndEndAtBefore(employeeId, start, end);
        for (LocalTime slot : slots) {
            for (WorkingHour workingHour : workingHours) {
                LocalTime startTime = workingHour.getStartAt().toLocalTime();
                LocalTime endTime = workingHour.getEndAt().toLocalTime();
                if (slot.isBefore(startTime) || slot.equals(endTime) || slot.isAfter(endTime)) {
                    removeSlots.add(slot);
                } else {
                    removeSlots.remove(slot);
                    break;
                }
            }
        }
        slots.removeAll(removeSlots);
        return slots;
    }

    private List<OpeningHour> getOpeningHours(List<OpeningHour> openingHours, Day day) {
        List<OpeningHour> openingHoursForDay = new ArrayList<>();
        for (OpeningHour openingHour : openingHours) {
            if (openingHour.getDay().equals(day)) {
                openingHoursForDay.add(openingHour);
            }
        }
        return openingHoursForDay;
    }

    private List<LocalTime> getSlots(List<OpeningHour> openingHours, int duration, LocalDate date) {
        List<LocalTime> slots = new ArrayList<>();
        for (OpeningHour openingHour : openingHours) {
            LocalDateTime start = LocalDateTime.of(date, openingHour.getStartTime());
            LocalDateTime end = LocalDateTime.of(date, openingHour.getEndTime());
            slots.add(openingHour.getStartTime());

            LocalDateTime localDateTime = start.plusMinutes(duration);
            while (localDateTime.isBefore(end)) {
                slots.add(localDateTime.toLocalTime());
                localDateTime = localDateTime.plusMinutes(duration);
            }
        }
        return slots;
    }

    private List<ClosingTime> filterClosingTimes(List<ClosingTime> closingTimes, LocalDate date) {
        LocalDateTime localDateTime = LocalDateTime.of(date, LocalTime.of(0, 0));
        List<ClosingTime> filteredClosingTime = new ArrayList<>();
        for (ClosingTime closingTime : closingTimes) {
            if (localDateTime.isAfter(closingTime.getStartAt()) && localDateTime.isBefore(closingTime.getEndAt())) {
                filteredClosingTime.add(closingTime);
            }
        }
        return filteredClosingTime;
    }

    private List<LocalTime> filterSlotsByClosingTimes(List<LocalTime> slots, List<ClosingTime> closingTimes) {
        List<LocalTime> removeSlots = new ArrayList<>();
        for (ClosingTime closingTime : closingTimes) {
            for (LocalTime slot : slots) {
                LocalDateTime start = closingTime.getStartAt();
                LocalDateTime end = closingTime.getEndAt();
                if (slot.isAfter(start.toLocalTime()) && slot.isBefore(end.toLocalTime())) {
                    removeSlots.add(slot);
                }
            }
        }
        slots.removeAll(removeSlots);
        return slots;
    }

}
