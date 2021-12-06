package de.apnmt.organizationappointment.common.service;

import de.apnmt.common.event.value.WorkingHourEventDTO;
import de.apnmt.organizationappointment.common.domain.WorkingHour;
import de.apnmt.organizationappointment.common.repository.WorkingHourRepository;
import de.apnmt.organizationappointment.common.service.mapper.WorkingHourEventMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link WorkingHour}.
 */
@Service
@Transactional
public class WorkingHourService {

    private final Logger log = LoggerFactory.getLogger(WorkingHourService.class);

    private final WorkingHourRepository workingHourRepository;
    private final WorkingHourEventMapper workingHourEventMapper;

    public WorkingHourService(WorkingHourRepository workingHourRepository, WorkingHourEventMapper workingHourEventMapper) {
        this.workingHourRepository = workingHourRepository;
        this.workingHourEventMapper = workingHourEventMapper;
    }

    /**
     * Save a workingHour.
     *
     * @param workingHourDTO the entity to save.
     */
    public void save(WorkingHourEventDTO workingHourDTO) {
        this.log.debug("Request to save WorkingHour : {}", workingHourDTO);
        WorkingHour workingHour = this.workingHourEventMapper.toEntity(workingHourDTO);
        this.workingHourRepository.save(workingHour);
    }

    /**
     * Delete a workingHour.
     *
     * @param workingHourDTO the entity to delete.
     */
    public void delete(WorkingHourEventDTO workingHourDTO) {
        this.log.debug("Request to delete WorkingHour : {}", workingHourDTO);
        this.workingHourRepository.deleteById(workingHourDTO.getId());
    }

}
