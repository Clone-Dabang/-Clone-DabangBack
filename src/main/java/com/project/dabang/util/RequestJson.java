package com.project.dabang.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RequestJson {

    /**
     * Request Json 상위 카테고리
     */
    @SerializedName("saleInfo")
    public SaleInfoDetail saleInfoDetail;

    @SerializedName("addressInfo")
    public AddressInfoDetail addressInfoDetail;

    @SerializedName("tradeInfo")
    public TradeInfoDetail tradeInfoDetail;

    @SerializedName("basicInfo")
    public BasicInfoDetail basicInfoDetail;

    @SerializedName("additionalInfo")
    public AdditionalInfo additionalInfo;

    @SerializedName("appliance")
    public ApplianceInfo applianceInfo;

    @SerializedName("detailInfo")
    public DetailInfoDetail detailInfoDetail;

    @SerializedName("imageUpload")
    public ImageUpload imageUpload;

    @SerializedName("count")
    public int count;


    /**
     * Requested Json 하위 카테고리
     */
    private class SaleInfoDetail {
        @SerializedName("roomType")
        public String roomType;
    }

    private class AddressInfoDetail {

        @SerializedName("road")
        public String road;

        @SerializedName("original")
        public String original;
    }

    private class TradeInfoDetail {
        @SerializedName("monthlyDeposit")
        public int monthlyDeposit;

        @SerializedName("yearlyDeposit")
        public int yearlyDeposit;

        @SerializedName("monthlyPay")
        public int monthlyPay;

        @SerializedName("isMonthly")
        public boolean isMonthly;

        @SerializedName("isYearly")
        public boolean isYearly;

    }

    private class BasicInfoDetail {
        @SerializedName("buildingArea")
        public int buildingArea;

        @SerializedName("floor")
        public int floor;

        @SerializedName("movingDate")
        public LocalDateTime movingDate;
    }

    private class AdditionalInfo {
        @SerializedName("managementFee")
        public int managementFee;

        @SerializedName("isParkingSpace")
        public boolean isParkingSpace;

        @SerializedName("hasPet")
        public boolean hasPet;

        @SerializedName("hasElevator")
        public boolean hasElevator;

        @SerializedName("hasBalcony")
        public boolean hasBalcony;

        @SerializedName("hasBuiltIn")
        public boolean hasBuiltIn;

        @SerializedName("innerType")
        public boolean innerType;

        @SerializedName("loanPossibility")
        public boolean loanPossibility;
    }

    private class ApplianceInfo {
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

    private class DetailInfoDetail {
        @SerializedName("title")
        public String title;

        @SerializedName("contents")
        public String contents;
    }

    private class ImageUpload {
        @SerializedName("url")
        public List<String> url;
    }
}
