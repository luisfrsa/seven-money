package com.luis.sevenmoney.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class Location {

    private String address;
    private String city;
    private String country;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;
    private Long id;
    private LabourSettings labourSettings;
    private BigDecimal lat;
    private BigDecimal lng;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modified;
    private String state;
    private TimeZone timezone;

    public String getAddress() {
        return address;
    }

    public Location setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Location setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Location setCountry(String country) {
        this.country = country;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Location setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Location setId(Long id) {
        this.id = id;
        return this;
    }

    public LabourSettings getLabourSettings() {
        return labourSettings;
    }

    public Location setLabourSettings(LabourSettings labourSettings) {
        this.labourSettings = labourSettings;
        return this;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public Location setLat(BigDecimal lat) {
        this.lat = lat;
        return this;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public Location setLng(BigDecimal lng) {
        this.lng = lng;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Location setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public String getState() {
        return state;
    }

    public Location setState(String state) {
        this.state = state;
        return this;
    }

    public TimeZone getTimezone() {
        return timezone;
    }

    public Location setTimezone(TimeZone timezone) {
        this.timezone = timezone;
        return this;
    }
}
