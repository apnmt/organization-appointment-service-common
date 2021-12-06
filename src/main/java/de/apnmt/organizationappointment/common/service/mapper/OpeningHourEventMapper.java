package de.apnmt.organizationappointment.common.service.mapper;

import de.apnmt.common.event.value.OpeningHourEventDTO;
import de.apnmt.organizationappointment.common.domain.OpeningHour;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link OpeningHour} and its DTO {@link OpeningHourEventDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface OpeningHourEventMapper extends EntityMapper<OpeningHourEventDTO, OpeningHour> {
}
