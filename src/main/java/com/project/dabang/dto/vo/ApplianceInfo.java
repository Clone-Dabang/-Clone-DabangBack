package com.project.dabang.dto.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ApplianceInfo {
    @SerializedName("hasInduction")
    public boolean hasInduction;

    @SerializedName("hasMicrowave")
    public boolean hasMicrowave;

    @SerializedName("hasAirConditioner")
    public boolean hasAirConditioner;

    @SerializedName("hasWasher")
    public boolean hasWasher;

    @SerializedName("hasTv")
    public boolean hasTv;

    @SerializedName("hasCloset")
    public boolean hasCloset;

    @SerializedName("hasBed")
    public boolean hasBed;

    @SerializedName("hasDesk")
    public boolean hasDesk;

    @SerializedName("hasShoeCloset")
    public boolean hasShoeCloset;

    @SerializedName("hasBidet")
    public boolean hasBidet;

    @SerializedName("hasGasRange")
    public boolean hasGasRange;

    @SerializedName("hasRefrigerator")
    public boolean hasRefrigerator;

    @SerializedName("hasDoorLock")
    public boolean hasDoorLock;

}