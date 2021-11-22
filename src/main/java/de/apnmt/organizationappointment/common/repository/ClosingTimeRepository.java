package de.apnmt.organizationappointment.common.repository;

import de.apnmt.organizationappointment.common.domain.ClosingTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the ClosingTime entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClosingTimeRepository extends MongoRepository<ClosingTime, Long> {

    List<ClosingTime> findAllByOrganizationId(Long organizationId);

}
