package com.project.dabang.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.project.dabang.domain.construction.InnerType;
import com.project.dabang.domain.construction.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RawRequestDto {

    private SaleInfo saleInfo;
    private AddressInfo addressInfo;
    private TradeInfo tradeInfo;
    private BasicInfo basicInfo;
    private AdditionalInfo additionalInfo;
    private Appliance appliance;
    private DetailInfo detailInfo;
    private int count;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class SaleInfo {
        private RoomType roomType;        // String to RoomType
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class AddressInfo {
        private String road;
        private String original;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class TradeInfo {
        private int monthlyDeposit;
        private int yearlyDeposit;
        private int monthlyPay;
        private boolean isMonthly;
        private boolean isYearly;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class BasicInfo {
        public int buildingArea;
        public int floor;
        public String movingDate; // chore: Localdatetim -> String
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class AdditionalInfo {
        public int managementFee;
        public boolean isParkingSpace;
        public boolean hasPet;
        public boolean hasElevator;
        public boolean hasBalcony;
        public boolean hasBuiltIn;
        public InnerType innerType;           // chore: String -> InnerType
        public boolean loanPossibility;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class Appliance {
        public boolean hasInduction;
        public boolean hasMicrowave;
        public boolean hasAirConditioner;
        public boolean hasWasher;
        public boolean hasTv;
        public boolean hasCloset;
        public boolean hasBed;
        public boolean hasDesk;
        public boolean hasShoeCloset;
        public boolean hasBidet;
        public boolean hasGasRange;
        public boolean hasRefrigerator;
        public boolean hasDoorLock;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class DetailInfo {
        public String title;
        public String contents;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class ImageUpload {
        public List<String> url;
    }
}