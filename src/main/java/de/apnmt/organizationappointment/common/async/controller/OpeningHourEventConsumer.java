package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.OpeningHourEventDTO;
import de.apnmt.organizationappointment.common.service.OpeningHourService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpeningHourEventConsumer implements ApnmtEventConsumer<OpeningHourEventDTO> {

    private final Logger log = LoggerFactory.getLogger(OpeningHourEventConsumer.class);

    private final OpeningHourService openingHourService;

    public OpeningHourEventConsumer(OpeningHourService openingHourService) {
        this.openingHourService = openingHourService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<OpeningHourEventDTO> event) {
        if (event.getType() == ApnmtEventType.openingHourCreated) {
            this.openingHourService.save(event.getValue());
        } else if (event.getType() == ApnmtEventType.openingHourDeleted) {
            this.openingHourService.delete(event.getValue());
        } else {
            log.error("Received wrong event type {}", event.getType());
        }
    }
}
