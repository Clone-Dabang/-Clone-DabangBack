package com.project.dabang.dto.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AddressInfoDetail {

    @SerializedName("road")
    private String road;

    @SerializedName("original")
    private String original;
}