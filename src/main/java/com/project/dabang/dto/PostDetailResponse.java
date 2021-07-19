package com.project.dabang.dto;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Sale;

public class PostDetailResponse {
    private Post post;
    private Trade trade;
    private Construction construction;
    private Appliance appliance;

    public PostDetailResponse(Post post, Trade trade, Construction construction, Appliance appliance) {
        this.post = post;
        this.trade = trade;
        this.construction = construction;
        this.appliance = appliance;
    }
}
