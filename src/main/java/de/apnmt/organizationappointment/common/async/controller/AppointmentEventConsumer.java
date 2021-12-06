package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.value.AppointmentEventDTO;
import de.apnmt.organizationappointment.common.service.AppointmentService;

public class AppointmentEventConsumer implements ApnmtEventConsumer<AppointmentEventDTO> {

    private final AppointmentService appointmentService;

    public AppointmentEventConsumer(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<AppointmentEventDTO> event) {
        switch (event.getType()) {
            case appointmentCreated:
                this.appointmentService.save(event.getValue());
                break;
            case appointmentDeleted:
                this.appointmentService.delete(event.getValue());
                break;
        }
    }
}
