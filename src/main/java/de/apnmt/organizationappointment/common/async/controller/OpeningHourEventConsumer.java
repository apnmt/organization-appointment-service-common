package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.value.OpeningHourEventDTO;
import de.apnmt.organizationappointment.common.service.OpeningHourService;

public class OpeningHourEventConsumer implements ApnmtEventConsumer<OpeningHourEventDTO> {

    private final OpeningHourService openingHourService;

    public OpeningHourEventConsumer(OpeningHourService openingHourService) {
        this.openingHourService = openingHourService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<OpeningHourEventDTO> event) {
        switch (event.getType()) {
            case openingHourCreated:
                this.openingHourService.save(event.getValue());
                break;
            case openingHourDeleted:
                this.openingHourService.delete(event.getValue());
                break;
        }
    }
}
