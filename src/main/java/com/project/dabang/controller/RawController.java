package com.project.dabang.controller;


import com.project.dabang.dto.RawRequestDto;
import com.project.dabang.service.RawService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RawController {
    private final RawService rawService;

    @PostMapping("/api/roomposts")
    public void createPost(@RequestBody RawRequestDto rawRequestDto) {
        rawService.register(rawRequestDto);
    }

}
