package de.apnmt.organizationappointment.common.web.rest;

import de.apnmt.organizationappointment.common.domain.OpeningHour;
import de.apnmt.organizationappointment.common.repository.OpeningHourRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.ResponseUtil;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link OpeningHour}.
 */
@RestController
@RequestMapping("/api")
public class OpeningHourResource {

    private final Logger log = LoggerFactory.getLogger(OpeningHourResource.class);

    private static final String ENTITY_NAME = "organizationappointmentserviceOpeningHour";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final OpeningHourRepository openingHourRepository;

    public OpeningHourResource(OpeningHourRepository openingHourRepository) {
        this.openingHourRepository = openingHourRepository;
    }

    /**
     * {@code GET  /opening-hours} : get all the openingHours.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of openingHours in body.
     */
    @GetMapping("/opening-hours")
    public List<OpeningHour> getAllOpeningHours() {
        log.debug("REST request to get all OpeningHours");
        return openingHourRepository.findAll();
    }

    /**
     * {@code GET  /opening-hours/:id} : get the "id" openingHour.
     *
     * @param id the id of the openingHour to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the openingHour, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/opening-hours/{id}")
    public ResponseEntity<OpeningHour> getOpeningHour(@PathVariable Long id) {
        log.debug("REST request to get OpeningHour : {}", id);
        Optional<OpeningHour> openingHour = openingHourRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(openingHour);
    }

    /**
     * {@code DELETE  /opening-hours} : dlete all openingHours.
     *
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/opening-hours")
    public ResponseEntity<Void> deleteOpeningHours() {
        openingHourRepository.deleteAllByIdGreaterThan(1255L);
        return ResponseEntity.noContent().build();
    }
}
