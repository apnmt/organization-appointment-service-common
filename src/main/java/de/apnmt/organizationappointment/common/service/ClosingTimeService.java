package de.apnmt.organizationappointment.common.service;

import de.apnmt.common.event.value.ClosingTimeEventDTO;
import de.apnmt.organizationappointment.common.domain.Appointment;
import de.apnmt.organizationappointment.common.domain.ClosingTime;
import de.apnmt.organizationappointment.common.repository.ClosingTimeRepository;
import de.apnmt.organizationappointment.common.service.mapper.ClosingTimeEventMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Appointment}.
 */
@Service
@Transactional
public class ClosingTimeService {

    private final Logger log = LoggerFactory.getLogger(ClosingTimeService.class);

    private final ClosingTimeRepository closingTimeRepository;
    private final ClosingTimeEventMapper closingTimeEventMapper;

    public ClosingTimeService(ClosingTimeRepository closingTimeRepository, ClosingTimeEventMapper closingTimeEventMapper) {
        this.closingTimeRepository = closingTimeRepository;
        this.closingTimeEventMapper = closingTimeEventMapper;
    }

    /**
     * Save a closingTime.
     *
     * @param closingTimeEventDTO the entity to save.
     */
    public void save(ClosingTimeEventDTO closingTimeEventDTO) {
        this.log.debug("Request to save ClsoingTime : {}", closingTimeEventDTO);
        ClosingTime closingTime = this.closingTimeEventMapper.toEntity(closingTimeEventDTO);
        this.closingTimeRepository.save(closingTime);
    }

    /**
     * Delete a closingTime.
     *
     * @param closingTimeEventDTO the entity to delete.
     */
    public void delete(ClosingTimeEventDTO closingTimeEventDTO) {
        this.log.debug("Request to delete ClosingTime : {}", closingTimeEventDTO);
        this.closingTimeRepository.deleteById(closingTimeEventDTO.getId());
    }

}
