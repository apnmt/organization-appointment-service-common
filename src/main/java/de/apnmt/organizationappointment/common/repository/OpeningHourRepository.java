package de.apnmt.organizationappointment.common.repository;

import de.apnmt.organizationappointment.common.domain.OpeningHour;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the OpeningHour entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OpeningHourRepository extends MongoRepository<OpeningHour, Long> {

    List<OpeningHour> findAllByOrganizationId(Long organizationId);

}
