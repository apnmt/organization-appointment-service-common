package de.apnmt.organizationappointment.common.repository;

import de.apnmt.organizationappointment.common.domain.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Service entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ServiceRepository extends MongoRepository<Service, Long> {
}
