package com.project.dabang.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Img extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "img_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    private String imgUrl;
}