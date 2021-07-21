package com.project.dabang.domain.trade.sale;


import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
@NoArgsConstructor
@Getter
public class Monthly extends Sale {

    private int deposit;
    private int pay;

    public Monthly(RawRequestDto rawRequestDto) {
        this.deposit = rawRequestDto.getTradeInfo().getMonthlyDeposit();
        this.pay = rawRequestDto.getTradeInfo().getMonthlyPay();
    }
}
