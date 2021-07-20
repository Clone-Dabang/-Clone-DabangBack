package com.project.dabang.repository;

import com.project.dabang.domain.Img;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImgRepository extends JpaRepository<Img, Long> {
    List<Img> findAllByPostId(Long postId);
}
