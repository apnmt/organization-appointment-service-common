package de.apnmt.organizationappointment.common.web.rest;

import java.util.List;
import java.util.Optional;

import de.apnmt.organizationappointment.common.domain.Service;
import de.apnmt.organizationappointment.common.repository.ServiceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link Service}.
 */
@RestController
@RequestMapping("/api")
public class ServiceResource {

    private final Logger log = LoggerFactory.getLogger(ServiceResource.class);

    private static final String ENTITY_NAME = "organizationappointmentserviceService";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ServiceRepository serviceRepository;

    public ServiceResource(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    /**
     * {@code GET  /services} : get all the services.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of services in body.
     */
    @GetMapping("/services")
    public List<Service> getAllServices() {
        log.debug("REST request to get all Services");
        return serviceRepository.findAll();
    }

    /**
     * {@code GET  /services/:id} : get the "id" service.
     *
     * @param id the id of the service to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the service, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/services/{id}")
    public ResponseEntity<Service> getService(@PathVariable Long id) {
        log.debug("REST request to get Service : {}", id);
        Optional<Service> service = serviceRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(service);
    }
}
