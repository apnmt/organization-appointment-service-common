package de.apnmt.organizationappointment.common.repository;

import de.apnmt.organizationappointment.common.domain.WorkingHour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Spring Data MongoDB repository for the WorkingHour entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WorkingHourRepository extends MongoRepository<WorkingHour, Long> {

    List<WorkingHour> findAllByEmployeeIdAndStartAtAfterAndEndAtBefore(Long employeeId, LocalDateTime startAt, LocalDateTime endAt);

}
