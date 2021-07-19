package com.project.dabang.testcontroller;

import com.project.dabang.dto.RawRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/api/test")
    public void test(@RequestBody RawRequestDto rawRequestDto) {
        Member member = new Member(rawRequestDto);
        String title = member.getTitle();
        String contents = member.getContents();
        System.out.println("title : " + title);
        System.out.println("contents : " + contents);
    }
}
