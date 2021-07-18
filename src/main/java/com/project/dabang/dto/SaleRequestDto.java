package com.project.dabang.dto;

import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Sale;
import com.project.dabang.domain.trade.sale.Yearly;
import lombok.Builder;
import lombok.Getter;



@Getter
public class SaleRequestDto extends M {
    private Long id;
    private int deposit;
    private int pay;


    public SaleRequestDto(Long id, int deposit, int pay) {
        this.id = id;
        this.deposit = deposit;
        this.pay = pay;
    }

    public static SaleRequestDto saleRequestDto (Sale sale, Monthly monthly, Yearly yearly){
        return com.project.dabang.dto.TradeRequestDto.builder()
                .id(sale.getId())
                .deposit(yearly.getDeposit())
                .deposit(monthly.getDeposit())
                .pay(monthly.getPay())
                .build();
    }

}
