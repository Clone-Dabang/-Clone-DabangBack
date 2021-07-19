package com.project.dabang.domain.trade.sale;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Y")
@NoArgsConstructor
@Getter
public class Yearly extends Sale{

    private int deposit;

    public Yearly(RawRequestDto rawRequestDto) {
        this.deposit = rawRequestDto.getTradeInfo().getYearlyDeposit();
    }
}