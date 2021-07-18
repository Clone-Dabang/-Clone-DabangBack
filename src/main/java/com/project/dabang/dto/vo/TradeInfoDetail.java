package com.project.dabang.dto.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class TradeInfoDetail {
    @SerializedName("monthlyDeposit")
    private int monthlyDeposit;

    @SerializedName("yearlyDeposit")
    private int yearlyDeposit;

    @SerializedName("monthlyPay")
    private int monthlyPay;

    @SerializedName("isMonthly")
    private boolean isMonthly;

    @SerializedName("isYearly")
    private boolean isYearly;

}