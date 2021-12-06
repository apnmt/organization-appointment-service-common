package de.apnmt.organizationappointment.common.service.mapper;

import de.apnmt.common.event.value.AppointmentEventDTO;
import de.apnmt.organizationappointment.common.domain.Appointment;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Appointment} and its DTO {@link AppointmentEventDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AppointmentEventMapper extends EntityMapper<AppointmentEventDTO, Appointment> {
}
