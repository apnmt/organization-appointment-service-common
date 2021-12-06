package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.value.WorkingHourEventDTO;
import de.apnmt.organizationappointment.common.service.WorkingHourService;

public class WorkingHourEventConsumer implements ApnmtEventConsumer<WorkingHourEventDTO> {

    private final WorkingHourService workingHourService;

    public WorkingHourEventConsumer(WorkingHourService workingHourService) {
        this.workingHourService = workingHourService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<WorkingHourEventDTO> event) {
        switch (event.getType()) {
            case workingHourCreated:
                this.workingHourService.save(event.getValue());
                break;
            case workingHourDeleted:
                this.workingHourService.delete(event.getValue());
                break;
        }
    }
}
