package com.project.dabang.dto;

import com.project.dabang.domain.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostRequestDto {
    private Long id;
    private String title;
    private String contents;

    @Builder
    public PostRequestDto(Long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    public static PostRequestDto postRequestDto (Post post){
        return PostRequestDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .contents(post.getContents())
                .build();
    }

}
