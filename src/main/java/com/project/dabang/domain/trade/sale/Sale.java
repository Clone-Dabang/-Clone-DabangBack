package com.project.dabang.domain.trade.sale;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.dabang.domain.Timestamped;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 추후 관련 블로그 찾아서 처리하기
@DiscriminatorColumn(name = "dtype")
@Getter
public abstract class Sale {

    @Id
    @GeneratedValue
    @Column(name = "sale_id")
    @JsonIgnore
    private Long id;
}
