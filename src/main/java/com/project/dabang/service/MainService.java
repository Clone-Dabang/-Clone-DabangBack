package com.project.dabang.service;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.construction.RoomType;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.TradeSale;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import com.project.dabang.dto.MainResponseDto;
import com.project.dabang.repository.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
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
        RoomType roomType = construction.getRoomType();
        int floor = construction.getFloor();
        int buildingArea = construction.getBuildingArea();
        Trade trade = tradeRepository.findByPostId(id);
        int managementFee = trade.getManagementFee();
        TradeSale tradeSale1 = trade.getTradeSales().get(0);
        TradeSale tradeSale2 = trade.getTradeSales().get(1);
        Long saleId1 = tradeSale1.getSale().getId();
        Long saleId2 = tradeSale2.getSale().getId();
        Monthly monthly = monthlyRepository.getById(saleId1);
        Yearly yearly = yearlyRepository.getById(saleId2);
        int monthlyDeposit = monthly.getDeposit();
        int pay = monthly.getPay();
        int yearlyDeposit = yearly.getDeposit();
        Post post = postRepository.getById(id);
        String title = post.getTitle();
        for (Img s : imgRepository.findAllByPostId(id)) {
            post.addImgList(s);
        }

        return new MainResponseDto(id,roomType, title, monthlyDeposit, pay, yearlyDeposit, managementFee, buildingArea, floor, post.getImgList());

    }
}
