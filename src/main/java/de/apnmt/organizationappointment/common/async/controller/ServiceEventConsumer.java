package de.apnmt.organizationappointment.common.async.controller;

import de.apnmt.common.controller.ApnmtEventConsumer;
import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.ServiceEventDTO;
import de.apnmt.organizationappointment.common.service.ServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceEventConsumer implements ApnmtEventConsumer<ServiceEventDTO> {

    private final Logger log = LoggerFactory.getLogger(ServiceEventConsumer.class);

    private final ServiceService serviceService;

    public ServiceEventConsumer(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @Override
    public void receiveEvent(ApnmtEvent<ServiceEventDTO> event) {
        if (event.getType() == ApnmtEventType.serviceCreated) {
            this.serviceService.save(event.getValue());
        } else if (event.getType() == ApnmtEventType.serviceDeleted) {
            this.serviceService.delete(event.getValue());
        } else {
            log.error("Received wrong event type {}", event.getType());
        }
    }
}
