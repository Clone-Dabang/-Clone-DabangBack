package com.project.dabang.dto;

public class RawRequestDto {
    private SaleInfo saleInfo;

    private AddressInfo addressInfo;

    private TradeInfo tradeInfo;

    private class SaleInfo {
        private String roomType;
    }

    private class AddressInfo {
        private String road;
        private String original;
    }

    private class TradeInfo {
        private int monthlyDeposit;
        private int yearlyDeposit;
        private int monthlyPay;
        private boolean isMonthly;
        private boolean isYearly;

    }
}