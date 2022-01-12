package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.WorkingHourEventDTO;
import de.apnmt.organizationappointment.common.service.WorkingHourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkingHourEventConsumer implements ApnmtEventConsumer<WorkingHourEventDTO> {

    private final Logger log = LoggerFactory.getLogger(WorkingHourEventConsumer.class);

    private final WorkingHourService workingHourService;

    public WorkingHourEventConsumer(WorkingHourService workingHourService) {
        this.workingHourService = workingHourService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<WorkingHourEventDTO> event) {
        if (event.getType() == ApnmtEventType.workingHourCreated) {
            this.workingHourService.save(event.getValue());
        } else if (event.getType() == ApnmtEventType.workingHourDeleted) {
            this.workingHourService.delete(event.getValue());
        } else {
            log.error("Received wrong event type {}", event.getType());
        }
    }
}
