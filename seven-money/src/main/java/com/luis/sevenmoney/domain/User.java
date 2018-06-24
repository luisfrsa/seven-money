package com.luis.sevenmoney.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

    private boolean active;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created;
    private String email;
    private String firstName;
    private BigDecimal hourlyWage;
    private Long id;
    private String lastName;
    private Long locationId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modified;
    private String photo;
    private Integer userType;


    public boolean isActive() {
        return active;
    }

    public User setActive(boolean active) {
        this.active = active;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public User setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public BigDecimal getHourlyWage() {
        return hourlyWage;
    }

    public User setHourlyWage(BigDecimal hourlyWage) {
        this.hourlyWage = hourlyWage;
        return this;
    }

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Long getLocationId() {
        return locationId;
    }

    public User setLocationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public User setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public User setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public Integer getUserType() {
        return userType;
    }

    public User setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }


    @Override
    public String toString() {
        return "User{" +
                "active=" + active +
                ", created=" + created +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", hourlyWage=" + hourlyWage +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                ", locationId=" + locationId +
                ", modified=" + modified +
                ", photo='" + photo + '\'' +
                ", userType=" + userType +
                '}';
    }
}
