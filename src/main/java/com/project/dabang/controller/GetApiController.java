package com.project.dabang.controller;

import com.project.dabang.dto.MainResponseDto;
import com.project.dabang.repository.PostRepository;
import com.project.dabang.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
public class GetApiController {
    private final MainService mainService;
    private final PostRepository postRepository;

    @GetMapping("/api/posts")
    public List<MainResponseDto> getMain() {
        return postRepository.findAll()
                .stream()
                .map(post -> mainService.createMain(post.getId()))
                .collect(Collectors.toList());
    }
}
