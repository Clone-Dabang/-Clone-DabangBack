package com.project.dabang.dto;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import lombok.Getter;

@Getter
public class PostDetailResponseDto {
    private Post post;
    private Trade trade;
    private Construction construction;
    private Appliance appliance;

    public PostDetailResponseDto(Post post, Trade trade, Construction construction, Appliance appliance) {
        this.post = post;
        this.trade = trade;
        this.construction = construction;
        this.appliance = appliance;
    }
}
