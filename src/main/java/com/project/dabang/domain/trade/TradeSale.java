package com.project.dabang.domain.trade;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.domain.trade.sale.Sale;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TradeSale extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "trade_sale_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trade_id")
    private Trade trade;

    @OneToOne(optional = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sale_id")
    private Sale sale;

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

}
