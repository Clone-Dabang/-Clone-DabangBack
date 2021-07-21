package com.project.dabang.dto;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.construction.RoomType;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import lombok.Getter;

import java.util.List;


@Getter
public class MainResponseDto {
    private Long postId;
    private RoomType roomType;
    private String title;
    private int monthlyDeposit;
    private int pay;
    private int yearlyDeposit;
    private int managementFee;
    private float buildingArea;
    private int floor;
    private List<String> url;

    public MainResponseDto(Long postId,
                           Construction construction,
                           Trade trade, Post post,
                           Monthly monthly, Yearly yearly,
                           List<String> url) {
        this.postId = postId;
        this.roomType = construction.getRoomType();
        this.title = post.getTitle();
        this.monthlyDeposit = monthly.getDeposit();
        this.pay = monthly.getPay();
        this.yearlyDeposit = yearly.getDeposit();
        this.managementFee = trade.getManagementFee();
        this.buildingArea = construction.getBuildingArea();
        this.floor = construction.getFloor();
        this.url = url;
    }
}
