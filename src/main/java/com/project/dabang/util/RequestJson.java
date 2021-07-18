package com.project.dabang.util;

import com.google.gson.annotations.SerializedName;
import com.project.dabang.dto.vo.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
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

//    @Getter
//    @Setter
//    public static class SaleInfoDetail {
//        @SerializedName("roomType")
//        private String roomType;
//    }
//
//
//    @Getter
//    @NoArgsConstructor
//    public static class AddressInfoDetail {
//
//        @SerializedName("road")
//        private String road;
//
//        @SerializedName("original")
//        private String original;
//    }
//
//    @Getter
//    @NoArgsConstructor
//    public class TradeInfoDetail {
//        @SerializedName("monthlyDeposit")
//        private int monthlyDeposit;
//
//        @SerializedName("yearlyDeposit")
//        private int yearlyDeposit;
//
//        @SerializedName("monthlyPay")
//        private int monthlyPay;
//
//        @SerializedName("isMonthly")
//        private boolean isMonthly;
//
//        @SerializedName("isYearly")
//        private boolean isYearly;
//
//    }
//
//    public class BasicInfoDetail {
//        @SerializedName("buildingArea")
//        public int buildingArea;
//
//        @SerializedName("floor")
//        public int floor;
//
//        @SerializedName("movingDate")
//        public LocalDateTime movingDate;
//    }
//
//    public class AdditionalInfo {
//        @SerializedName("managementFee")
//        public int managementFee;
//
//        @SerializedName("isParkingSpace")
//        public boolean isParkingSpace;
//
//        @SerializedName("hasPet")
//        public boolean hasPet;
//
//        @SerializedName("hasElevator")
//        public boolean hasElevator;
//
//        @SerializedName("hasBalcony")
//        public boolean hasBalcony;
//
//        @SerializedName("hasBuiltIn")
//        public boolean hasBuiltIn;
//
//        @SerializedName("innerType")
//        public boolean innerType;
//
//        @SerializedName("loanPossibility")
//        public boolean loanPossibility;
//    }
//
//    public class ApplianceInfo {
//        @SerializedName("hasInduction")
//        public boolean hasInduction;
//
//        @SerializedName("hasMicrowave")
//        public boolean hasMicrowave;
//
//        @SerializedName("hasAirConditioner")
//        public boolean hasAirConditioner;
//
//        @SerializedName("hasWasher")
//        public boolean hasWasher;
//
//        @SerializedName("hasTv")
//        public boolean hasTv;
//
//        @SerializedName("hasCloset")
//        public boolean hasCloset;
//
//        @SerializedName("hasBed")
//        public boolean hasBed;
//
//        @SerializedName("hasDesk")
//        public boolean hasDesk;
//
//        @SerializedName("hasShoeCloset")
//        public boolean hasShoeCloset;
//
//        @SerializedName("hasBidet")
//        public boolean hasBidet;
//
//        @SerializedName("hasGasRange")
//        public boolean hasGasRange;
//
//        @SerializedName("hasRefrigerator")
//        public boolean hasRefrigerator;
//
//        @SerializedName("hasDoorLock")
//        public boolean hasDoorLock;
//
//    }
//
//    public class DetailInfoDetail {
//        @SerializedName("title")
//        public String title;
//
//        @SerializedName("contents")
//        public String contents;
//    }
//
//    public class ImageUpload {
//        @SerializedName("url")
//        public List<String> url;
//    }
}