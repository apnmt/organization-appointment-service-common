package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.AppointmentEventDTO;
import de.apnmt.organizationappointment.common.service.AppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppointmentEventConsumer implements ApnmtEventConsumer<AppointmentEventDTO> {

    private final Logger log = LoggerFactory.getLogger(AppointmentEventConsumer.class);

    private final AppointmentService appointmentService;

    public AppointmentEventConsumer(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<AppointmentEventDTO> event) {
        if (event.getType() == ApnmtEventType.appointmentCreated) {
            this.appointmentService.save(event.getValue());
        } else if (event.getType() == ApnmtEventType.appointmentDeleted) {
            this.appointmentService.delete(event.getValue());
        } else {
            log.error("Received wrong event type {}", event.getType());
        }
    }
}
