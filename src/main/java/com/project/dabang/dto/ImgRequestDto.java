package com.project.dabang.dto;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ImgRequestDto {
    private Long id;
    private Post post;
    private String imgUrl;

    @Builder
    public ImgRequestDto(Long id, Post post, String imgUrl) {
        this.id = id;
        this.post = post;
        this.imgUrl = imgUrl;
    }

    public static ImgRequestDto imgRequestDto (Img img){
        return ImgRequestDto.builder()
                .id(img.getId())
                .post(img.getPost())
                .imgUrl(img.getImgUrl())
                .build();
    }
}
