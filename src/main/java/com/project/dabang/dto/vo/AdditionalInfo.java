package com.project.dabang.dto.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AdditionalInfo {
    @SerializedName("managementFee")
    private int managementFee;

    @SerializedName("isParkingSpace")
    private boolean isParkingSpace;

    @SerializedName("hasPet")
    private boolean hasPet;

    @SerializedName("hasElevator")
    private boolean hasElevator;

    @SerializedName("hasBalcony")
    private boolean hasBalcony;

    @SerializedName("hasBuiltIn")
    private boolean hasBuiltIn;

    @SerializedName("innerType")
    private boolean innerType;

    @SerializedName("loanPossibility")
    private boolean loanPossibility;
}
