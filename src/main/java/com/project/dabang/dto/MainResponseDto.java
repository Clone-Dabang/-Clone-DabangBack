package com.project.dabang.dto;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.construction.RoomType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class MainResponseDto {
    private RoomType roomType;
    private String title;
    private int monthlyDeposit;
    private int pay;
    private int yearlyDeposit;
    private int managementFee;
    private int buildingArea;
    private int floor;
    private List<Img> imgList;

    public MainResponseDto(RoomType roomType, String title, int monthlyDeposit, int pay, int yearlyDeposit, int managementFee, int buildingArea, int floor, List<Img> imgList) {
        this.roomType = roomType;
        this.title = title;
        this.monthlyDeposit = monthlyDeposit;
        this.pay = pay;
        this.yearlyDeposit = yearlyDeposit;
        this.managementFee = managementFee;
        this.buildingArea = buildingArea;
        this.floor = floor;
        this.imgList = imgList;
    }
}
