package de.apnmt.organizationappointment.common.service;

import de.apnmt.common.event.value.AppointmentEventDTO;
import de.apnmt.organizationappointment.common.domain.Appointment;
import de.apnmt.organizationappointment.common.repository.AppointmentRepository;
import de.apnmt.organizationappointment.common.service.mapper.AppointmentEventMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Appointment}.
 */
@Service
@Transactional
public class AppointmentService {

    private final Logger log = LoggerFactory.getLogger(AppointmentService.class);

    private final AppointmentRepository appointmentRepository;
    private final AppointmentEventMapper appointmentEventMapper;

    public AppointmentService(AppointmentRepository appointmentRepository, AppointmentEventMapper appointmentEventMapper) {
        this.appointmentRepository = appointmentRepository;
        this.appointmentEventMapper = appointmentEventMapper;
    }

    /**
     * Save a appointment.
     *
     * @param appointmentDTO the entity to save.
     */
    public void save(AppointmentEventDTO appointmentDTO) {
        this.log.debug("Request to save Appointment : {}", appointmentDTO);
        Appointment appointment = this.appointmentEventMapper.toEntity(appointmentDTO);
        this.appointmentRepository.save(appointment);
    }

    /**
     * Delete a appointment.
     *
     * @param appointmentDTO the entity to delete.
     */
    public void delete(AppointmentEventDTO appointmentDTO) {
        this.log.debug("Request to delete Appointment : {}", appointmentDTO);
        this.appointmentRepository.deleteById(appointmentDTO.getId());
    }

}
