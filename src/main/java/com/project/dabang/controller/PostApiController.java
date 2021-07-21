package com.project.dabang.controller;

import com.project.dabang.dto.DetailResponseDto;
import com.project.dabang.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @GetMapping("/api/posts/{id}")
    public DetailResponseDto getPost(@PathVariable Long id) {
        return postService.createDetailPost(id);
    }
}
