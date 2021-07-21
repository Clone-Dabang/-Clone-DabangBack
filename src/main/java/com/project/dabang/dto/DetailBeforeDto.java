package com.project.dabang.dto;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import lombok.Getter;

import java.util.List;

@Getter
public class DetailBeforeDto {
    private Post post;
    private List<Img> img;
    private Trade trade;
    private Construction construction;
    private Appliance appliance;

    public DetailBeforeDto(Post post, List<Img> img, Trade trade, Construction construction, Appliance appliance) {
        this.post = post;
        this.img = img;
        this.trade = trade;
        this.construction = construction;
        this.appliance = appliance;
    }
}
