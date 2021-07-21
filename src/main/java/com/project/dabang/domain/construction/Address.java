package com.project.dabang.domain.construction;

import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
public class Address {

    private String road;
    private String original;
    private String latitude;
    private String longitude;


    public Address(RawRequestDto rawRequestDto) {
        this.road = rawRequestDto.getAddressInfo().getRoad();
        this.original = rawRequestDto.getAddressInfo().getOriginal();
        this.latitude = rawRequestDto.getAddressInfo().getLatitude();
        this.longitude = rawRequestDto.getAddressInfo().getLongitude();

    }
}

