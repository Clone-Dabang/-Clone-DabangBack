package com.project.dabang.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Img extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "img_id")
    private Long id;

    private String img;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    public Img(String img) {
        this.img = img;
    }

    //    public static String createImg(RawRequestDto rawRequestDto) {
//        Img img = new Img();
//        List<String> urls = rawRequestDto.getImageUpload().getUrl();
//        for (String url : urls) {
//            img.add(url);
//        }
//        return img.getImg();
//    }
}

