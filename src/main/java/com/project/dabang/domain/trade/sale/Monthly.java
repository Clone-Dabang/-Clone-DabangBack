package com.project.dabang.domain.trade.sale;


import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
@Getter
public class Monthly extends Sale {

    private int deposit;
    private int pay;
}
