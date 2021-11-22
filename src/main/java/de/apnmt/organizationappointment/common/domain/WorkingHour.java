package de.apnmt.organizationappointment.common.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A WorkingHour.
 */
@Document(collection = "working_hour")
public class WorkingHour implements Serializable {

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
    @Field("employee_id")
    private Long employeeId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public WorkingHour id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    public WorkingHour startAt(LocalDateTime startAt) {
        this.setStartAt(startAt);
        return this;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    public WorkingHour endAt(LocalDateTime endAt) {
        this.setEndAt(endAt);
        return this;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public WorkingHour employeeId(Long employeeId) {
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
        if (!(o instanceof WorkingHour)) {
            return false;
        }
        return this.id != null && this.id.equals(((WorkingHour) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "WorkingHour{" +
                "id=" + getId() +
                ", startAt='" + getStartAt() + "'" +
                ", endAt='" + getEndAt() + "'" +
                "}";
    }
}
