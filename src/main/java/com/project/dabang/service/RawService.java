package com.project.dabang.service;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Address;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.construction.DetailInfo;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import com.project.dabang.dto.RawRequestDto;
import com.project.dabang.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class RawService {
    private final ApplianceRepository applianceRepository;
    private final ConstructionRepository constructionRepository;
    private final ImgRepository imgRepository;
    private final MonthlyRepository monthlyRepository;
    private final PostRepository postRepository;
    private final TradeRepository tradeRepository;
    private final YearlyRepository yearlyRepository;

    @Autowired
    public RawService(ApplianceRepository applianceRepository,
                        ConstructionRepository constructionRepository,
                        ImgRepository imgRepository,
                        MonthlyRepository monthlyRepository,
                        PostRepository postRepository,
                        TradeRepository tradeRepository,
                        YearlyRepository yearlyRepository) {
        this.applianceRepository = applianceRepository;
        this.constructionRepository = constructionRepository;
        this.monthlyRepository = monthlyRepository;
        this.yearlyRepository = yearlyRepository;
        this.tradeRepository = tradeRepository;
        this.postRepository = postRepository;
        this.imgRepository = imgRepository;
    }
    public void register(@RequestBody RawRequestDto rawRequestDto) {
        Appliance appliance = new Appliance(rawRequestDto);
        applianceRepository.save(appliance);
        Address address = new Address(rawRequestDto);
        DetailInfo detailInfo = new DetailInfo(rawRequestDto);
        Construction construction = new Construction(rawRequestDto);
        construction.setAddress(address);
        construction.setDetailInfo(detailInfo);
        constructionRepository.save(construction);
        Monthly monthly = new Monthly(rawRequestDto);
        monthlyRepository.save(monthly);
        Yearly yearly = new Yearly(rawRequestDto);
        yearlyRepository.save(yearly);
        Trade trade = new Trade(rawRequestDto);
        tradeRepository.save(trade);
//        Post post = Post.createPost(rawRequestDto);
////        System.out.println(post);
//        Post post = new Post(rawRequestDto);
//        postRepository.save(post);
//        List<Img> img = new Img(rawRequestDto.getImageUpload().getUrl());

    }

}
