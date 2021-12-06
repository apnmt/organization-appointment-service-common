package de.apnmt.organizationappointment.common.service;

import de.apnmt.common.event.value.OpeningHourEventDTO;
import de.apnmt.organizationappointment.common.domain.OpeningHour;
import de.apnmt.organizationappointment.common.repository.OpeningHourRepository;
import de.apnmt.organizationappointment.common.service.mapper.OpeningHourEventMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link OpeningHour}.
 */
@Service
@Transactional
public class OpeningHourService {

    private final Logger log = LoggerFactory.getLogger(OpeningHourService.class);

    private final OpeningHourRepository openingHourRepository;
    private final OpeningHourEventMapper openingHourEventMapper;

    public OpeningHourService(OpeningHourRepository openingHourRepository, OpeningHourEventMapper openingHourEventMapper) {
        this.openingHourRepository = openingHourRepository;
        this.openingHourEventMapper = openingHourEventMapper;
    }

    /**
     * Save a openingHour.
     *
     * @param openingHourDTO the entity to save.
     */
    public void save(OpeningHourEventDTO openingHourDTO) {
        this.log.debug("Request to save OpeningHour : {}", openingHourDTO);
        OpeningHour openingHour = this.openingHourEventMapper.toEntity(openingHourDTO);
        this.openingHourRepository.save(openingHour);
    }

    /**
     * Delete a openingHour.
     *
     * @param openingHourDTO the entity to delete.
     */
    public void delete(OpeningHourEventDTO openingHourDTO) {
        this.log.debug("Request to delete OpeningHour : {}", openingHourDTO);
        this.openingHourRepository.deleteById(openingHourDTO.getId());
    }

}
