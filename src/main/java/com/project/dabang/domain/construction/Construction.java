package com.project.dabang.domain.construction;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Construction extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "construction_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    private int buildingArea;

    private int floor;

    @Embedded
    private DetailInfo detailInfo;

    @Embedded
    private Address address;


    public Construction(RawRequestDto rawRequestDto) {
        this.roomType = rawRequestDto.getSaleInfo().getRoomType();
        this.buildingArea = rawRequestDto.getBasicInfo().getBuildingArea();
        this.floor = rawRequestDto.getBasicInfo().getFloor();
        this.detailInfo = getDetailInfo(); // 임베드의 경우 이렇게 처리
        this.address = getAddress();
    }

    
}
