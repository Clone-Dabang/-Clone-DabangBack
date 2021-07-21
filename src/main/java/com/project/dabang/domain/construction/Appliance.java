package com.project.dabang.domain.construction;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class Appliance extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "appliance_id")
    private Long id;

    @Column(nullable = false)
    private Long postId;

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

    public Appliance(RawRequestDto rawRequestDto, Long keyValue) {
        this.postId = keyValue;
        this.hasInduction = rawRequestDto.getAppliance().isHasInduction();
        this.hasMicrowave = rawRequestDto.getAppliance().isHasMicrowave();
        this.hasAirConditioner = rawRequestDto.getAppliance().isHasAirConditioner();
        this.hasWasher = rawRequestDto.getAppliance().isHasWasher();
        this.hasTv = rawRequestDto.getAppliance().isHasTv();
        this.hasCloset = rawRequestDto.getAppliance().isHasCloset();
        this.hasBed = rawRequestDto.getAppliance().isHasBed();
        this.hasDesk = rawRequestDto.getAppliance().isHasDesk();
        this.hasShoeCloset = rawRequestDto.getAppliance().isHasShoeCloset();
        this.hasBidet = rawRequestDto.getAppliance().isHasBidet();
        this.hasGasRange = rawRequestDto.getAppliance().isHasGasRange();
        this.hasRefrigerator = rawRequestDto.getAppliance().isHasRefrigerator();
        this.hasDoorLock = rawRequestDto.getAppliance().isHasDoorLock();
    }
}