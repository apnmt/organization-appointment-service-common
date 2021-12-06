package de.apnmt.organizationappointment.common.service.mapper;

import de.apnmt.common.event.value.WorkingHourEventDTO;
import de.apnmt.organizationappointment.common.domain.WorkingHour;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link WorkingHour} and its DTO {@link WorkingHourEventDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface WorkingHourEventMapper extends EntityMapper<WorkingHourEventDTO, WorkingHour> {
}
