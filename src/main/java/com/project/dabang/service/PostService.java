package com.project.dabang.service;

import com.project.dabang.domain.Post;
import com.project.dabang.dto.PostDetailResponse;
import com.project.dabang.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;

    public PostDetailResponse findById(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 게시물이 없습니다.")
        );
        return new PostDetailResponse(post);
    }
}
