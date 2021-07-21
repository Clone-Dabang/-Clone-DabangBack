package com.project.dabang.domain.trade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.dabang.domain.Timestamped;
import com.project.dabang.domain.trade.sale.Sale;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter // Setter 열어둔거 조치 필요
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TradeSale extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "trade_sale_id")
    private Long id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trade_id")
    private Trade trade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sale_id")
    private Sale sale;

//    public TradeSale(Trade trade, Sale sale) {
//        this.trade = trade;
//        this.sale = sale;
//    }

    //==생성 메서드==//
    public static TradeSale createTradeSale(Sale sale) {
        TradeSale tradeSale = new TradeSale();
        tradeSale.setSale(sale);
        return tradeSale;
    }
}
