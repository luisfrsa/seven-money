package com.luis.sevenmoney.domain;

public class AutoBreakRules {
    Long id;
    private Integer breakLength;
    private Integer threshold;


    public Long getId() {
        return id;
    }

    public AutoBreakRules setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getBreakLength() {
        return breakLength;
    }

    public AutoBreakRules setBreakLength(Integer breakLength) {
        this.breakLength = breakLength;
        return this;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public AutoBreakRules setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
}