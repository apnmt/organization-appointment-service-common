package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.ClosingTimeEventDTO;
import de.apnmt.organizationappointment.common.service.ClosingTimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClosingTimeEventConsumer implements ApnmtEventConsumer<ClosingTimeEventDTO> {

    private final Logger log = LoggerFactory.getLogger(ClosingTimeEventConsumer.class);

    private final ClosingTimeService closingTimeService;

    public ClosingTimeEventConsumer(ClosingTimeService closingTimeService) {
        this.closingTimeService = closingTimeService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<ClosingTimeEventDTO> event) {
        if (event.getType() == ApnmtEventType.closingTimeCreated) {
            this.closingTimeService.save(event.getValue());
        } else if (event.getType() == ApnmtEventType.closingTimeDeleted) {
            this.closingTimeService.delete(event.getValue());
        } else {
            log.error("Received wrong event type {}", event.getType());
        }
    }
}
