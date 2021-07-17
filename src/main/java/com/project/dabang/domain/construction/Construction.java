package com.project.dabang.domain.construction;

import com.project.dabang.domain.Timestamped;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
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



}
