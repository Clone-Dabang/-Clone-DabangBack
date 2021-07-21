package com.project.dabang.domain;

import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Setter
public class Post extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String title;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String contents;

    @Transient
    private final List<Img> imgList = new ArrayList<>();

    public void addImgList(Img img) {
        imgList.add(img);
    }

    public Post(RawRequestDto rawRequestDto) {
        this.title = rawRequestDto.getDetailInfo().getTitle();
        this.contents = rawRequestDto.getDetailInfo().getContents();
    }

}