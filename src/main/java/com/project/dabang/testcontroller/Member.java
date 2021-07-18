package com.project.dabang.testcontroller;


import com.project.dabang.domain.Post;
import com.project.dabang.dto.RawRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String title;

    private String contents;

    public Member(RawRequestDto requestDto) {
        this.title = requestDto.getDetailInfo().getTitle();
        this.contents = requestDto.getDetailInfo().getContents();
    }
}
