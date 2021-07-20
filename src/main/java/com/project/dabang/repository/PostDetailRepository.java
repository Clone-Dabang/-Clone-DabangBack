package com.project.dabang.repository;

import com.project.dabang.domain.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class PostDetailRepository {

    private final EntityManager em;

    public Post findOne(Long id) {
        return em.find(Post.class, id);
    }
}
