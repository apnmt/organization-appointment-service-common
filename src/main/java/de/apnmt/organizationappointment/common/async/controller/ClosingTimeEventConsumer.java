package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.value.ClosingTimeEventDTO;
import de.apnmt.organizationappointment.common.service.ClosingTimeService;

public class ClosingTimeEventConsumer implements ApnmtEventConsumer<ClosingTimeEventDTO> {

    private final ClosingTimeService closingTimeService;

    public ClosingTimeEventConsumer(ClosingTimeService closingTimeService) {
        this.closingTimeService = closingTimeService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<ClosingTimeEventDTO> event) {
        switch (event.getType()) {
            case closingTimeCreated:
                this.closingTimeService.save(event.getValue());
                break;
            case closingTimeDeleted:
                this.closingTimeService.delete(event.getValue());
                break;
        }
    }
}
