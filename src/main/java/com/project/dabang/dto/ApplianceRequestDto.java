package com.project.dabang.dto;


import lombok.Getter;

@Getter
public class ApplianceRequestDto {
    private Long id;
    private boolean hasInduction;
    private boolean hasMicrowave;
    private boolean hasAirConditioner;
    private boolean hasWasher;
    private boolean hasTv;
    private boolean hasCloset;
    private boolean hasBed;
    private boolean hasDesk;
    private boolean hasShoeCloset;
    private boolean hasBidet;
    private boolean hasGasRange;
    private boolean hasRefrigerator;
    private boolean hasDoorLock;


    public ApplianceRequestDto(Long id, boolean hasInduction, boolean hasMicrowave, boolean hasAirConditioner, boolean hasWasher, boolean hasTv, boolean hasCloset, boolean hasBed, boolean hasDesk, boolean hasShoeCloset, boolean hasBidet, boolean hasGasRange, boolean hasRefrigerator, boolean hasDoorLock) {
        this.id = id;
        this.hasInduction = hasInduction;
        this.hasMicrowave = hasMicrowave;
        this.hasAirConditioner = hasAirConditioner;
        this.hasWasher = hasWasher;
        this.hasTv = hasTv;
        this.hasCloset = hasCloset;
        this.hasBed = hasBed;
        this.hasDesk = hasDesk;
        this.hasShoeCloset = hasShoeCloset;
        this.hasBidet = hasBidet;
        this.hasGasRange = hasGasRange;
        this.hasRefrigerator = hasRefrigerator;
        this.hasDoorLock = hasDoorLock;
    }


}
