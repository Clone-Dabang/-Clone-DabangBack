package com.project.dabang.domain.construction;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Construction {

    @Id
    @GeneratedValue
    @Column(name = "construction_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    private int buildingArea;

    private int floor;

    @Embedded
    private DetailInfo detailInfo = DetailInfo.EMPTY;

    @Embedded
    private Address address;
}
