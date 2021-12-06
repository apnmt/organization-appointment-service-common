package de.apnmt.organizationappointment.common.service.mapper;

import de.apnmt.common.event.value.ClosingTimeEventDTO;
import de.apnmt.organizationappointment.common.domain.ClosingTime;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link ClosingTime} and its DTO {@link ClosingTimeEventDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ClosingTimeEventMapper extends EntityMapper<ClosingTimeEventDTO, ClosingTime> {
}
