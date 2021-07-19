package com.project.dabang.domain.construction;

import com.project.dabang.dto.RawRequestDto;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String road;
    private String original;

//    protected Address() {
//
//    }

    public Address(RawRequestDto rawRequestDto) {
        this.road = rawRequestDto.getAddressInfo().getRoad();
        this.original = rawRequestDto.getAddressInfo().getOriginal();
    }
}

