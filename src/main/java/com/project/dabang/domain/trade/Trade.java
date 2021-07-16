package com.project.dabang.domain.trade;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Trade {

    @Id
    @GeneratedValue
    @Column(name = "construction_id")
    private Long id;

    @OneToMany(mappedBy = "trade")
    private List<TradeSale> tradeSales = new ArrayList<>();

    private LocalDateTime movingDate;

    private int managementFee;

    private boolean loanPossibility;
}
