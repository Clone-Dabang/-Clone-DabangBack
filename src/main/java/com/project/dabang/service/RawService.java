package com.project.dabang.service;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Address;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.construction.DetailInfo;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.TradeSale;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import com.project.dabang.dto.RawRequestDto;
import com.project.dabang.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class RawService {

    private final ApplianceRepository applianceRepository;
    private final ConstructionRepository constructionRepository;
    private final MonthlyRepository monthlyRepository;
    private final PostRepository postRepository;
    private final TradeRepository tradeRepository;
    private final YearlyRepository yearlyRepository;
    private final ImgRepository imgRepository;

    @Transactional
    public void register(@RequestBody RawRequestDto rawRequestDto) {

        Post post = new Post(rawRequestDto);
        postRepository.save(post);

        Long keyValue = post.getId();

        List<String> images = new ArrayList<>(rawRequestDto.getImageUpload().getUrl());
        images.stream()
                .map(image -> new Img(image, keyValue))
                .forEach(imgRepository::save);

        Appliance appliance = new Appliance(rawRequestDto, keyValue);
        applianceRepository.save(appliance);

        Address address = new Address(rawRequestDto);
        DetailInfo detailInfo = new DetailInfo(rawRequestDto);
        Construction construction = new Construction(rawRequestDto, keyValue);
        construction.setAddress(address);
        construction.setDetailInfo(detailInfo);
        constructionRepository.save(construction);

        Monthly monthly = new Monthly(rawRequestDto);
        monthlyRepository.save(monthly);

        Yearly yearly = new Yearly(rawRequestDto);
        yearlyRepository.save(yearly);

        TradeSale mothlyTradeSale = TradeSale.createTradeSale(monthly);
        TradeSale yearlyTradeSale = TradeSale.createTradeSale(yearly);
        Trade trade = Trade.createTrade(rawRequestDto, keyValue, mothlyTradeSale, yearlyTradeSale);
        tradeRepository.save(trade);
    }

}
