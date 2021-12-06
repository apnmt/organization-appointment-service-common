package de.apnmt.organizationappointment.common.service.mapper;

import de.apnmt.common.event.value.ServiceEventDTO;
import de.apnmt.organizationappointment.common.domain.Service;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Service} and its DTO {@link ServiceEventDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ServiceEventMapper extends EntityMapper<ServiceEventDTO, Service> {
}
