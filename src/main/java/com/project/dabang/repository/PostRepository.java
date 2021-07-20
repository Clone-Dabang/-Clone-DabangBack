package com.project.dabang.repository;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.trade.Trade;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PostRepository {

    private final EntityManager em;

    public Trade findOne(Long id) {
        return em.find(Trade.class, id);
    }

}
