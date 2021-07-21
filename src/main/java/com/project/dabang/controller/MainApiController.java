package com.project.dabang.controller;

import com.project.dabang.dto.MainResponseDto;
import com.project.dabang.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class MainApiController {
    private final MainService mainService;

    @GetMapping("/api/posts")
    public Map<String,List<MainResponseDto>> getMain() {
        return mainService.getMain();
    }
}
