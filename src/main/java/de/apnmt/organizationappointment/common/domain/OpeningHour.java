package de.apnmt.organizationappointment.common.domain;

import de.apnmt.organizationappointment.common.domain.enumeration.Day;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;

/**
 * A OpeningHour.
 */
@Document(collection = "opening_hour")
public class OpeningHour implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Field("day")
    private Day day;

    @NotNull
    @Field("start_time")
    private LocalTime startTime;

    @NotNull
    @Field("end_time")
    private LocalTime endTime;

    @NotNull
    @Field("organization_id")
    private Long organizationId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public OpeningHour id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Day getDay() {
        return this.day;
    }

    public OpeningHour day(Day day) {
        this.setDay(day);
        return this;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public OpeningHour startTime(LocalTime startTime) {
        this.setStartTime(startTime);
        return this;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public OpeningHour endTime(LocalTime endTime) {
        this.setEndTime(endTime);
        return this;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public OpeningHour organizationId(Long organizationId) {
        this.setOrganizationId(organizationId);
        return this;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpeningHour)) {
            return false;
        }
        return this.id != null && this.id.equals(((OpeningHour) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OpeningHour{" +
                "id=" + getId() +
                ", day='" + getDay() + "'" +
                ", startTime='" + getStartTime() + "'" +
                ", endTime='" + getEndTime() + "'" +
                "}";
    }
}
