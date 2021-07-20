package com.project.dabang.service;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.dto.PostDetailResponseDto;
import com.project.dabang.repository.ApplianceRepository;
import com.project.dabang.repository.ConstructionRepository;
import com.project.dabang.repository.PostDetailRepository;
import com.project.dabang.repository.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostDetailRepository postDetailRepository;
    private final ApplianceRepository applianceRepository;
    private final TradeRepository tradeRepository;
    private final ConstructionRepository constructionRepository;

    public PostDetailResponseDto createDetailPost(Long id) {
        Post post = postDetailRepository.findOne(id);
        Appliance appliance = applianceRepository.findByPostId(id);
        Trade trade = tradeRepository.findByPostId(id);
        Construction construction = constructionRepository.findByPostId(id);

        return new PostDetailResponseDto(post,trade,construction,appliance);
    }
}
