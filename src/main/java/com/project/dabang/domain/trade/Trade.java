package com.project.dabang.domain.trade;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.dto.RawRequestDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Trade extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "trade_id")
    private Long id;

    @Column(nullable = false)
    private Long postId;

    @OneToMany(mappedBy = "trade", cascade = CascadeType.ALL)
    private List<TradeSale> tradeSales = new ArrayList<>();

    private String movingDate; // Localdatetime -> String

    private int managementFee;

    private boolean loanPossibility;


    public Trade(RawRequestDto rawRequestDto, Long keyValue) {
        this.postId = keyValue;
        this.movingDate = rawRequestDto.getBasicInfo().getMovingDate();
        this.managementFee = rawRequestDto.getAdditionalInfo().getManagementFee();
        this.loanPossibility = rawRequestDto.getAdditionalInfo().isLoanPossibility();
    }

    //== 편의 메서드 ==//
    public void addTradeSale(TradeSale tradeSale) {
        tradeSales.add(tradeSale);
        tradeSale.setTrade(this);
    }

    //== 생성 메서드 ==//
    public static Trade createTrade(RawRequestDto rawRequestDto, Long keyValue,
                                    TradeSale... tradeSales) {
        Trade trade = new Trade(rawRequestDto, keyValue);
        for (TradeSale tradeSale : tradeSales) {
            trade.addTradeSale(tradeSale);
        }
        return trade;
    }
}
