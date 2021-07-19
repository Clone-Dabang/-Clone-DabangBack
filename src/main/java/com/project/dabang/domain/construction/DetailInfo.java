package com.project.dabang.domain.construction;

import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
@NoArgsConstructor
public class DetailInfo {

    private boolean isParkingSpace;
    private boolean hasPet;
    private boolean hasElevator;
    private boolean hasbalcony;
    private boolean hasBuiltIn;

    @Enumerated(EnumType.STRING)
    private InnerType innerType;

    public DetailInfo(RawRequestDto rawRequestDto) {
        this.isParkingSpace = rawRequestDto.getAdditionalInfo().isParkingSpace();
        this.hasPet = rawRequestDto.getAdditionalInfo().isHasPet();
        this.hasElevator = rawRequestDto.getAdditionalInfo().isHasElevator();
        this.hasbalcony = rawRequestDto.getAdditionalInfo().isHasBalcony();
        this.hasBuiltIn = rawRequestDto.getAdditionalInfo().isHasBuiltIn();
        this.innerType = rawRequestDto.getAdditionalInfo().getInnerType();
    }
}
