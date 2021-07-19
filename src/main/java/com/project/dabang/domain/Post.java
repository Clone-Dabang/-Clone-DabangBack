package com.project.dabang.domain;

import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@NoArgsConstructor
public class Post extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    private String title;

    private String contents;

    //
    @OneToMany(mappedBy = "post")
    private List<Img> imgs = new ArrayList<>();

    public Post(RawRequestDto rawRequestDto) {
        this.title = rawRequestDto.getDetailInfo().getTitle();
        this.contents = rawRequestDto.getDetailInfo().getContents();
    }

    public static Post createPost(RawRequestDto rawRequestDto) {
        Post post = new Post();
        List<String> urls = rawRequestDto.getImageUpload().getUrl();
        for (String url : urls) {
            Img img = new Img(url);
            post.imgs.add(img);
        }
        return post;

    }
}

//    public static Post createPost(RawRequestDto rawRequestDto) {
//        Post post = new Post();
//        List<String> urls = rawRequestDto.getImageUpload().getUrl();
//        List<Img> collect = urls.stream().map(String -> new Img()).collect(Collectors.toList());
//        for (Img url : collect) {
//            post.imgs.add(url);
//        }
//        return post;


//    //== 편의 메서드 ==/
//    public void addImg(Img img) {
//        imgs.add(img);
//        img.setPost(this);
//    }
//
//    //== 생성 메서드 ==/
//    public static Post createPost(RawRequestDto rawRequestDto) {
//        Post post = new Post();
//        List<String> urls = rawRequestDto.getImageUpload().getUrl();
//    }
