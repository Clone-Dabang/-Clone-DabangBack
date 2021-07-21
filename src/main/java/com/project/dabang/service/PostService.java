package com.project.dabang.service;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.dto.DetailBeforeDto;
import com.project.dabang.dto.DetailResponseDto;
import com.project.dabang.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostDetailRepository postDetailRepository;
    private final ApplianceRepository applianceRepository;
    private final TradeRepository tradeRepository;
    private final ConstructionRepository constructionRepository;
    private final ImgRepository imgRepository;

    public DetailResponseDto createDetailPost(Long id) {
        Post post = postDetailRepository.findOne(id);
        Appliance appliance = applianceRepository.findByPostId(id);
        Trade trade = tradeRepository.findByPostId(id);
        Construction construction = constructionRepository.findByPostId(id);
        List<Img> img = imgRepository.findAllByPostId(id);

        DetailBeforeDto detailBeforeDto = new DetailBeforeDto(post, img, trade, construction, appliance);
        return new DetailResponseDto(detailBeforeDto);
    }
}
