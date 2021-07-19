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
import com.project.dabang.repository.RawRepository;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;



@Service
public class RawService {
    private final RawRepository rawRepository;

    @Autowired
    public RawService(RawRepository rawRepository) {
        this.rawRepository = rawRepository;

    }
    public void register(@RequestBody RawRequestDto rawRequestDto) {
        Appliance appliance = new Appliance(rawRequestDto);
        rawRepository.save(appliance);
        Construction construction = new Construction(rawRequestDto);
        rawRepository.save(construction);
        Address address = new Address(rawRequestDto);
        rawRepository.save(address);
        DetailInfo detailInfo = new DetailInfo(rawRequestDto);
        rawRepository.save(detailInfo);
        Monthly monthly = new Monthly(rawRequestDto);
        rawRepository.save(monthly);
        Yearly yearly = new Yearly(rawRequestDto);
        rawRepository.save(yearly);
        Trade trade = new Trade(rawRequestDto);
        rawRepository.save(trade);
        Post post = new Post(rawRequestDto);
        rawRepository.save(post);
        Img img = new Img(rawRequestDto);
        rawRepository.save(img);
    }

//    public void getAll(Long constructionId) {
//
//    }
}
