package com.project.dabang.dto.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BasicInfoDetail {
    @SerializedName("buildingArea")
    private int buildingArea;

    @SerializedName("floor")
    private int floor;

    @SerializedName("movingDate")
    private LocalDateTime movingDate;
}
