package com.project.dabang.dto;

import com.project.dabang.domain.construction.*;
import com.project.dabang.domain.trade.Trade;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;



@Getter
public class ConstructionRequestDto {
    private Long id;
    private RoomType roomType;
    private int buildingArea;
    private int floor;
    private DetailInfo detailInfo;
    private Address address;
    private InnerType innerType;
    private boolean isParkingspace;
    private boolean hasPet;
    private boolean hasElevator;
    private boolean hasbalcony;
    private boolean hasBuiltIn;
    private String road;
    private String original;

    @Builder
    public ConstructionRequestDto(Long id,
                          RoomType roomType,
                          int buildingArea,
                          int floor,
                          DetailInfo detailInfo,
                          Address address,
                          InnerType innerType,
                          boolean isParkingspace,
                          boolean hasPet,
                          boolean hasElevator,
                          boolean hasbalcony,
                          boolean hasBuiltIn,
                          String road,
                          String original) {
        this.id = id;
        this.roomType = roomType;
        this.buildingArea = buildingArea;
        this.floor = floor;
        this.detailInfo = detailInfo;
        this.address = address;
        this.innerType = innerType;
        this.isParkingspace = isParkingspace;
        this.hasPet = hasPet;
        this.hasElevator = hasElevator;
        this.hasbalcony = hasbalcony;
        this.hasBuiltIn = hasBuiltIn;
        this.road = road;
        this.original = original;
    }

    public static ConstructionRequestDto constructionRequestDto (Construction construction,
                                                                 DetailInfo detailInfo,
                                                                 Address address) {
        return ConstructionRequestDto
                .builder()
                .id(construction.getId())
                .roomType(construction.getRoomType())
                .floor(construction.getFloor())
                .detailInfo(construction.getDetailInfo())
                .address(construction.getAddress())
                .innerType(detailInfo.getInnerType())
                .isParkingspace(detailInfo.isParkingSpace())
                .hasPet(detailInfo.isHasPet())
                .hasElevator(detailInfo.isHasElevator())
                .hasbalcony(detailInfo.isHasbalcony())
                .hasBuiltIn(detailInfo.isHasBuiltIn())
                .road(address.getRoad())
                .original(address.getOriginal())
                .build();
    }

}
