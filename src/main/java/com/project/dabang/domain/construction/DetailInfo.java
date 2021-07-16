package com.project.dabang.domain.construction;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@Getter
public class DetailInfo {

    private boolean isParkingSpace;
    private boolean hasPet;
    private boolean hasElevator;
    private boolean hasbalcony;
    private boolean hasBuiltIn;

//    private List<Appliance> appliances = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private InnerType innerType;
}
