package com.project.dabang.domain;

import lombok.Getter;

import javax.persistence.*;
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
}
