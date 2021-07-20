package com.project.dabang.repository;


import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.trade.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    Trade findByPostId(Long postId);
}
