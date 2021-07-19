package com.project.dabang.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Img extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "img_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    private String imgUrl;

//    public Img(Post post, RawRequestDto rawRequestDto) {
//        this.post = post;
//        this.imgUrl = rawRequestDto.;
//    }
}