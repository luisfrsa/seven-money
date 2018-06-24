package com.luis.sevenmoney.domain;

import java.util.List;

public class LabourSettings {
    private Long id;
    private boolean autoBreak;
    private double dailyOvertimeMultiplier;
    private Integer  dailyOvertimeThreshold;
    private boolean overtime;
    private String weeklyOvertimeMultiplier;
    private double weeklyOvertimeThreshold;
    private List<AutoBreakRules> autoBreakRules;


    public Long getId() {
        return id;
    }

    public LabourSettings setId(Long id) {
        this.id = id;
        return this;
    }

    public boolean isAutoBreak() {
        return autoBreak;
    }

    public LabourSettings setAutoBreak(boolean autoBreak) {
        this.autoBreak = autoBreak;
        return this;
    }

    public double getDailyOvertimeMultiplier() {
        return dailyOvertimeMultiplier;
    }

    public LabourSettings setDailyOvertimeMultiplier(double dailyOvertimeMultiplier) {
        this.dailyOvertimeMultiplier = dailyOvertimeMultiplier;
        return this;
    }

    public Integer  getDailyOvertimeThreshold() {
        return dailyOvertimeThreshold;
    }

    public LabourSettings setDailyOvertimeThreshold(Integer  dailyOvertimeThreshold) {
        this.dailyOvertimeThreshold = dailyOvertimeThreshold;
        return this;
    }

    public boolean isOvertime() {
        return overtime;
    }

    public LabourSettings setOvertime(boolean overtime) {
        this.overtime = overtime;
        return this;
    }

    public String getWeeklyOvertimeMultiplier() {
        return weeklyOvertimeMultiplier;
    }

    public LabourSettings setWeeklyOvertimeMultiplier(String weeklyOvertimeMultiplier) {
        this.weeklyOvertimeMultiplier = weeklyOvertimeMultiplier;
        return this;
    }

    public double getWeeklyOvertimeThreshold() {
        return weeklyOvertimeThreshold;
    }

    public LabourSettings setWeeklyOvertimeThreshold(double weeklyOvertimeThreshold) {
        this.weeklyOvertimeThreshold = weeklyOvertimeThreshold;
        return this;
    }

    public List<AutoBreakRules> getAutoBreakRules() {
        return autoBreakRules;
    }

    public LabourSettings setAutoBreakRules(List<AutoBreakRules> autoBreakRules) {
        this.autoBreakRules = autoBreakRules;
        return this;
    }
}