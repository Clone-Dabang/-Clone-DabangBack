package com.project.dabang.domain;

import com.project.dabang.dto.RawRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Img> imgs = new ArrayList<>();

    public Post(RawRequestDto rawRequestDto) {
        this.title = rawRequestDto.getDetailInfo().getTitle();
        this.contents = rawRequestDto.getDetailInfo().getContents();
    }
}