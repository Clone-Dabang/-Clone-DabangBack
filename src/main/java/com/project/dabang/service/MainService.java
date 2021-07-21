package com.project.dabang.service;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import com.project.dabang.dto.MainResponseDto;
import com.project.dabang.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MainService {
    private final ConstructionRepository constructionRepository;
    private final TradeRepository tradeRepository;
    private final PostRepository postRepository;
    private final MonthlyRepository monthlyRepository;
    private final YearlyRepository yearlyRepository;
    private final ImgRepository imgRepository;


    public MainResponseDto createMain(Long id) {

        Construction construction = constructionRepository.findByPostId(id);

        Trade trade = tradeRepository.findByPostId(id);
        Monthly monthly = monthlyRepository.getById(trade.getTradeSales().get(0).getSale().getId());
        Yearly yearly = yearlyRepository.getById(trade.getTradeSales().get(1).getSale().getId());
        Post post = postRepository.getById(id);

        imgRepository.findAllByPostId(id).forEach(post::addImgList);
        List<String> url = imgRepository.findAllByPostId(id)
                .stream()
                .map(Img::getImg)
                .collect(Collectors.toList());

        return new MainResponseDto(id, construction, trade, post, monthly, yearly, url);

    }

    public Map<String,List<MainResponseDto>> getMain() {
        Map<String,List<MainResponseDto>> listMap= new HashMap<>();
        List<MainResponseDto> list = new ArrayList<>();
        for (Post post : postRepository.findAll()) {
            MainResponseDto main = createMain(post.getId());
            list.add(main);
        }
        listMap.put("shortInfo",list);
        return listMap;
    }
}
