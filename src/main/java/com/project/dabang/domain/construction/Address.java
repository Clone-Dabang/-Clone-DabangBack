package com.project.dabang.domain.construction;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String road;
    private String original;

    protected Address() {

    }

    public Address(String road, String original) {
        this.road = road;
        this.original = original;
    }
}

