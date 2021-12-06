package de.apnmt.organizationappointment.common.service;

import de.apnmt.common.event.value.ServiceEventDTO;
import de.apnmt.organizationappointment.common.repository.ServiceRepository;
import de.apnmt.organizationappointment.common.service.mapper.ServiceEventMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Service}.
 */
@Service
@Transactional
public class ServiceService {

    private final Logger log = LoggerFactory.getLogger(ServiceService.class);

    private final ServiceRepository serviceRepository;
    private final ServiceEventMapper serviceEventMapper;

    public ServiceService(ServiceRepository serviceRepository, ServiceEventMapper serviceEventMapper) {
        this.serviceRepository = serviceRepository;
        this.serviceEventMapper = serviceEventMapper;
    }

    /**
     * Save a service.
     *
     * @param serviceDTO the entity to save.
     */
    public void save(ServiceEventDTO serviceDTO) {
        this.log.debug("Request to save Service : {}", serviceDTO);
        de.apnmt.organizationappointment.common.domain.Service service = this.serviceEventMapper.toEntity(serviceDTO);
        this.serviceRepository.save(service);
    }

    /**
     * Delete a service.
     *
     * @param serviceDTO the entity to delete.
     */
    public void delete(ServiceEventDTO serviceDTO) {
        this.log.debug("Request to delete Service : {}", serviceDTO);
        this.serviceRepository.deleteById(serviceDTO.getId());
    }

}
