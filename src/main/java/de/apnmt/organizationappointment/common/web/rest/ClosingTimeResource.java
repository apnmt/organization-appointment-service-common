package de.apnmt.organizationappointment.common.web.rest;

import java.util.List;
import java.util.Optional;

import de.apnmt.organizationappointment.common.domain.ClosingTime;
import de.apnmt.organizationappointment.common.repository.ClosingTimeRepository;
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
 * REST controller for managing {@link ClosingTime}.
 */
@RestController
@RequestMapping("/api")
public class ClosingTimeResource {

    private final Logger log = LoggerFactory.getLogger(ClosingTimeResource.class);

    private static final String ENTITY_NAME = "organizationappointmentserviceClosingTime";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final ClosingTimeRepository closingTimeRepository;

    public ClosingTimeResource(ClosingTimeRepository closingTimeRepository) {
        this.closingTimeRepository = closingTimeRepository;
    }

    /**
     * {@code GET  /closing-times} : get all the closingTimes.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of closingTimes in body.
     */
    @GetMapping("/closing-times")
    public List<ClosingTime> getAllClosingTimes() {
        log.debug("REST request to get all ClosingTimes");
        return closingTimeRepository.findAll();
    }

    /**
     * {@code GET  /closing-times/:id} : get the "id" closingTime.
     *
     * @param id the id of the closingTime to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the closingTime, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/closing-times/{id}")
    public ResponseEntity<ClosingTime> getClosingTime(@PathVariable Long id) {
        log.debug("REST request to get ClosingTime : {}", id);
        Optional<ClosingTime> closingTime = closingTimeRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(closingTime);
    }
}
