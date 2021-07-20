package com.project.dabang.repository;

import com.project.dabang.domain.trade.sale.Monthly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyRepository extends JpaRepository<Monthly, Long> {
}
