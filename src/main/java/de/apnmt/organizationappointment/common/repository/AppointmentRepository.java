package de.apnmt.organizationappointment.common.repository;

import de.apnmt.organizationappointment.common.domain.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Spring Data MongoDB repository for the Appointment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AppointmentRepository extends MongoRepository<Appointment, Long> {
    
    List<Appointment> findAllByOrganizationIdAndEmployeeIdAndStartAtAfterAndEndAtBefore(Long organizationId, Long employeeId, LocalDateTime startAt, LocalDateTime endAt);

}
