package com.project.dabang.domain;

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

    @Embedded
    private Address address;
}
