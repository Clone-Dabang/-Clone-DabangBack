package com.project.dabang.domain.trade;

import com.project.dabang.domain.Timestamped;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Trade extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "construction_id")
    private Long id;

    private LocalDateTime movingDate;

    private int managementFee;

    private boolean loanPossibility;

    //== 생성 메서드==//
//    @Builder
//    public static Trade createTrade(int managementFee,
//                                    boolean loanPossibility,
//                                    TradeSale... tradeSales) {
//        Trade trade = new Trade();
//        trade.
//        trade.
//    }

    //== 편의 메서드 ==//
//    public void addTradeSale(TradeSale tradeSale) {
//        tradeSales.add(tradeSale);
//        tradeSale.setOrder(this)
//    }
}
