package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.value.ServiceEventDTO;
import de.apnmt.organizationappointment.common.service.ServiceService;

public class ServiceEventConsumer implements ApnmtEventConsumer<ServiceEventDTO> {

    private final ServiceService serviceService;

    public ServiceEventConsumer(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<ServiceEventDTO> event) {
        switch (event.getType()) {
            case serviceCreated:
                this.serviceService.save(event.getValue());
                break;
            case serviceDeleted:
                this.serviceService.delete(event.getValue());
                break;
        }
    }
}
