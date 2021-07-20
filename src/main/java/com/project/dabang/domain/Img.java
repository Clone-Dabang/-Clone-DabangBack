package com.project.dabang.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Img extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "img_id")
    private Long id;
    @Column
    private String img;

    @Column
    private Long postId;

    public Img(String img, Long postId) {
        this.img = img;
        this.postId = postId;
    }

}

