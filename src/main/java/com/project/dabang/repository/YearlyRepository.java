package com.project.dabang.repository;

import com.project.dabang.domain.trade.sale.Yearly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearlyRepository extends JpaRepository<Yearly, Long> {
}
