package com.project.dabang.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.project.dabang.domain.construction.InnerType;
import com.project.dabang.domain.construction.RoomType;
import com.project.dabang.domain.trade.sale.Sale;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DetailResponseDto {

    private Long postId;
    private RoomType roomType;
    private String road;
    private String original;
    private String latitude;
    private String longitude;

    private Sale monthly;
    private Sale yearly;

    public float buildingArea;
    public int floor;
    public String movingDate;
    public int managementFee;
    public boolean isParkingSpace;
    public boolean hasPet;
    public boolean hasElevator;
    public boolean hasBalcony;
    public boolean hasBuiltIn;
    public InnerType innerType;
    public boolean loanPossibility;
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

    public String title;
    public String contents;

    public List<String> url;

    public DetailResponseDto(DetailBeforeDto detailBeforeDto) {
        this.postId = detailBeforeDto.getPost().getId();
        this.roomType = detailBeforeDto.getConstruction().getRoomType();

        this.road = detailBeforeDto.getConstruction().getAddress().getRoad();
        this.original = detailBeforeDto.getConstruction().getAddress().getOriginal();
        this.latitude = detailBeforeDto.getConstruction().getAddress().getLatitude();
        this.longitude = detailBeforeDto.getConstruction().getAddress().getLongitude();

        this.monthly = detailBeforeDto.getTrade().getTradeSales().get(0).getSale();
        this.yearly = detailBeforeDto.getTrade().getTradeSales().get(1).getSale();

        this.buildingArea = detailBeforeDto.getConstruction().getBuildingArea();
        this.floor = detailBeforeDto.getConstruction().getFloor();
        this.movingDate = detailBeforeDto.getTrade().getMovingDate();

        this.managementFee = detailBeforeDto.getTrade().getManagementFee();
        this.isParkingSpace = detailBeforeDto.getConstruction().getDetailInfo().isParkingSpace();
        this.hasPet = detailBeforeDto.getConstruction().getDetailInfo().isHasPet();
        this.hasElevator = detailBeforeDto.getConstruction().getDetailInfo().isHasElevator();
        this.hasBalcony = detailBeforeDto.getConstruction().getDetailInfo().isHasbalcony();
        this.hasBuiltIn = detailBeforeDto.getConstruction().getDetailInfo().isHasBuiltIn();
        this.innerType = detailBeforeDto.getConstruction().getDetailInfo().getInnerType();
        this.loanPossibility = detailBeforeDto.getTrade().isLoanPossibility();
        this.hasInduction = detailBeforeDto.getAppliance().isHasInduction();
        this.hasMicrowave = detailBeforeDto.getAppliance().isHasMicrowave();
        this.hasAirConditioner = detailBeforeDto.getAppliance().isHasAirConditioner();
        this.hasWasher = detailBeforeDto.getAppliance().isHasWasher();
        this.hasTv = detailBeforeDto.getAppliance().isHasTv();
        this.hasCloset = detailBeforeDto.getAppliance().isHasShoeCloset();
        this.hasBed = detailBeforeDto.getAppliance().isHasBed();
        this.hasDesk = detailBeforeDto.getAppliance().isHasDesk();
        this.hasShoeCloset = detailBeforeDto.getAppliance().isHasShoeCloset();
        this.hasBidet = detailBeforeDto.getAppliance().isHasBidet();
        this.hasGasRange = detailBeforeDto.getAppliance().isHasGasRange();
        this.hasRefrigerator = detailBeforeDto.getAppliance().isHasRefrigerator();
        this.hasDoorLock = detailBeforeDto.getAppliance().isHasDoorLock();

        this.title = detailBeforeDto.getPost().getTitle();
        this.contents = detailBeforeDto.getPost().getContents();

        this.url = detailBeforeDto.getImg()
                .stream()
                .map(img -> img.getImg())
                .collect(Collectors.toList());
    }
}
