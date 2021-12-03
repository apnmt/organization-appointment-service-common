package de.apnmt.organizationappointment.common.web.rest;

import de.apnmt.organizationappointment.common.service.AvailabilityService;
import de.apnmt.organizationappointment.common.service.dto.SlotDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * REST controller for retrieving {@link de.apnmt.organizationappointment.common.service.dto.SlotDTO}.
 */
@RestController
@RequestMapping("/api")
public class AvailabilityResource {

    private final Logger log = LoggerFactory.getLogger(AvailabilityResource.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AvailabilityService availabilityService;

    public AvailabilityResource(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    /**
     * {@code GET  /slots} : get all the available slots.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of slots in body.
     */
    @GetMapping("/slots")
    public SlotDTO getSlots(@RequestParam LocalDate date, @RequestParam Long serviceId, @RequestParam Long organizationId, @RequestParam Long employeeId) {
        this.log.debug("REST request to get all Availabilities");
        return this.availabilityService.findAvailableSlots(date, serviceId, organizationId, employeeId);
    }

}
