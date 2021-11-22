package de.apnmt.organizationappointment.common.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A Appointment.
 */
@Document(collection = "appointment")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @NotNull
    @Field("start_at")
    private LocalDateTime startAt;

    @NotNull
    @Field("end_at")
    private LocalDateTime endAt;

    @NotNull
    @Field("organization_id")
    private Long organizationId;

    @NotNull
    @Field("employee_id")
    private Long employeeId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Appointment id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    public Appointment startAt(LocalDateTime startAt) {
        this.setStartAt(startAt);
        return this;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    public Appointment endAt(LocalDateTime endAt) {
        this.setEndAt(endAt);
        return this;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public Appointment organizationId(Long organizationId) {
        this.setOrganizationId(organizationId);
        return this;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public Appointment employeeId(Long employeeId) {
        this.setEmployeeId(employeeId);
        return this;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Appointment)) {
            return false;
        }
        return this.id != null && this.id.equals(((Appointment) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + getId() +
                ", startAt='" + getStartAt() + "'" +
                ", endAt='" + getEndAt() + "'" +
                ", organizationId=" + getOrganizationId() +
                ", employeeId=" + getEmployeeId() +
                "}";
    }
}
