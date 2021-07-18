package com.project.dabang.dto;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Sale;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;


import java.time.LocalDateTime;


@Getter
public class TradeRequestDto {
    private Long id;
    private LocalDateTime movingDate;
    private int managementFee;
    private boolean loanPossibility;

    @Builder
    public TradeRequestDto(Long id, LocalDateTime movingDate, int managementFee, boolean loanPossibility) {
        this.id = id;
        this.movingDate = movingDate;
        this.managementFee = managementFee;
        this.loanPossibility =loanPossibility;
    }


    public static TradeRequestDto TradeRequestDto (Trade trade){
        return TradeRequestDto.builder()
                .id(trade.getId())
                .movingDate(trade.getMovingDate())
                .managementFee(trade.getManagementFee())
                .loanPossibility(trade.isLoanPossibility())
                .build();
    }


}
