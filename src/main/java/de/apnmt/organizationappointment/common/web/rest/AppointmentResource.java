package de.apnmt.organizationappointment.common.web.rest;

import java.util.List;
import java.util.Optional;

import de.apnmt.organizationappointment.common.domain.Appointment;
import de.apnmt.organizationappointment.common.repository.AppointmentRepository;
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
 * REST controller for managing {@link Appointment}.
 */
@RestController
@RequestMapping("/api")
public class AppointmentResource {

    private final Logger log = LoggerFactory.getLogger(AppointmentResource.class);

    private static final String ENTITY_NAME = "organizationappointmentserviceAppointment";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final AppointmentRepository appointmentRepository;

    public AppointmentResource(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    /**
     * {@code GET  /appointments} : get all the appointments.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of appointments in body.
     */
    @GetMapping("/appointments")
    public List<Appointment> getAllAppointments() {
        log.debug("REST request to get all Appointments");
        return appointmentRepository.findAll();
    }

    /**
     * {@code GET  /appointments/:id} : get the "id" appointment.
     *
     * @param id the id of the appointment to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the appointment, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/appointments/{id}")
    public ResponseEntity<Appointment> getAppointment(@PathVariable Long id) {
        log.debug("REST request to get Appointment : {}", id);
        Optional<Appointment> appointment = appointmentRepository.findById(id);
        return ResponseUtil.wrapOrNotFound(appointment);
    }
}
