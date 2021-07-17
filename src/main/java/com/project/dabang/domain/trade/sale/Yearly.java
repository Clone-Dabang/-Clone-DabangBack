package com.project.dabang.domain.trade.sale;

import com.project.dabang.domain.Timestamped;
import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Y")
@Getter
public class Yearly extends Sale{

    private int deposit;
}