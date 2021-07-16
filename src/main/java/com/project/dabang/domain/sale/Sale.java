package com.project.dabang.domain.sale;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 추후 관련 블로그 찾아서 처리하기
@DiscriminatorColumn(name="dtype")
@Getter
public abstract class Sale {

    @Id @GeneratedValue
    @Column(name="sale_id")
    private Long id;
}
