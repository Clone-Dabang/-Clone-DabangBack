package com.project.dabang.domain.construction;

import com.project.dabang.domain.Timestamped;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Appliance extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name="appliance_id")
    private Long id;

    private boolean hasInduction;
    private boolean hasMicrowave;
    private boolean hasAirConditioner;
    private boolean hasWasher;
    private boolean hasTv;
    private boolean hasCloset;
    private boolean hasBed;
    private boolean hasDesk;
    private boolean hasShoeCloset;
    private boolean hasBidet;
    private boolean hasGasRange;
    private boolean hasRefrigerator;
    private boolean hasDoorLock;

}