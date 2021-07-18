package com.project.dabang.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RawRequestDto {

    private SaleInfo saleInfo;
    private AddressInfo addressInfo;
    private TradeInfo tradeInfo;
    private BasicInfo basicInfo;
    private AddtionalInfo addtionalInfo;
    private ApplianceInfo applianceInfo;
    private DetailInfoDetail detailInfoDetail;
    private int count;


    @Getter
    public class SaleInfo {
        private String roomType;
    }

    @Getter
    public class AddressInfo {
        private String road;
        private String original;
    }

    @Getter
    public class TradeInfo {
        private int monthlyDeposit;
        private int yearlyDeposit;
        private int monthlyPay;
        private boolean isMonthly;
        private boolean isYearly;
    }

    @Getter
    public class BasicInfo {
        public int buildingArea;
        public int floor;
        public LocalDateTime movingDate;
    }

    @Getter
    public class AddtionalInfo {
        public int managementFee;
        public boolean isParkingSpace;
        public boolean hasPet;
        public boolean hasElevator;
        public boolean hasBalcony;
        public boolean hasBuiltIn;
        public boolean innerType;
        public boolean loanPossibility;
    }

    @Getter
    public class ApplianceInfo {
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

    @Getter
    public class DetailInfoDetail {
        public String title;
        public String contents;
    }

    @Getter
    public class ImageUpload {
        public List<String> url;
    }


}