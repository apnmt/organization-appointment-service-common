package de.apnmt.organizationappointment.common.web.rest;

import java.util.List;
import java.util.Optional;

import de.apnmt.organizationappointment.common.domain.WorkingHour;
import de.apnmt.organizationappointment.common.repository.WorkingHourRepository;
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
 * REST controller for managing {@link WorkingHour}.
 */
@RestController
@RequestMapping("/api")
public class WorkingHourResource {

    private final Logger log = LoggerFactory.getLogger(WorkingHourResource.class);

    private static final String ENTITY_NAME = "organizationappointmentserviceWorkingHour";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final WorkingHourRepository workingHourRepository;

    public WorkingHourResource(WorkingHourRepository workingHourRepository) {
        this.workingHourRepository = workingHourRepository;
    }

    /**
     * {@code GET  /working-hours} : get all the workingHours.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of workingHours in body.
     */
    @GetMapping("/working-hours")
    public List<WorkingHour> getAllWorkingHours() {
        log.debug("REST request to get all WorkingHours");
        return workingHourRepository.findAll();
    }

    /**
     * {@code GET  /working-hours/:id} : get the "id" workingHour.
     *
     * @param id the id of the workingHour to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the workingHour, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/working-hours/{id}")
    public ResponseEntity<WorkingHour> getWorkingHour(@PathVariable Long id) {
        log.debug("REST request to get WorkingHour : {}", id);
        Optional<WorkingHour> workingHour = workingHourRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(workingHour);
    }
}
