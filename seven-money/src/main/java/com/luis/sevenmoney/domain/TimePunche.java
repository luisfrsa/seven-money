package com.luis.sevenmoney.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class TimePunche  implements Cloneable {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime clockedIn;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime clockedOut;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modified;
    private Double hourlyWage;
    private Long id;
    private Long locationId;
    private Long userId;

    public LocalDateTime getClockedIn() {
        return clockedIn;
    }

    public TimePunche setClockedIn(LocalDateTime clockedIn) {
        this.clockedIn = clockedIn;
        return this;
    }

    public LocalDateTime getClockedOut() {
        return clockedOut;
    }

    public TimePunche setClockedOut(LocalDateTime clockedOut) {
        this.clockedOut = clockedOut;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public TimePunche setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public TimePunche setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
        return this;
    }

    public Long getId() {
        return id;
    }

    public TimePunche setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getLocationId() {
        return locationId;
    }

    public TimePunche setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public TimePunche setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public TimePunche setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
