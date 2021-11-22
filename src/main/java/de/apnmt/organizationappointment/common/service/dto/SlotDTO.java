package de.apnmt.organizationappointment.common.service.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class SlotDTO {

    private LocalDate date;

    private List<LocalTime> times;

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<LocalTime> getTimes() {
        return this.times;
    }

    public void setTimes(List<LocalTime> times) {
        this.times = times;
    }
}
