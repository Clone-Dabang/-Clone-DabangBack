package com.project.dabang.service;

import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.dto.DetailAfterDto;
import com.project.dabang.dto.DetailBeforeDto;
import com.project.dabang.repository.ApplianceRepository;
import com.project.dabang.repository.ConstructionRepository;
import com.project.dabang.repository.PostDetailRepository;
import com.project.dabang.repository.TradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostDetailRepository postDetailRepository;
    private final ApplianceRepository applianceRepository;
    private final TradeRepository tradeRepository;
    private final ConstructionRepository constructionRepository;

    public DetailBeforeDto createDetailPost(Long id) {
        Post post = postDetailRepository.findOne(id);
        Appliance appliance = applianceRepository.findByPostId(id);
        Trade trade = tradeRepository.findByPostId(id);
        Construction construction = constructionRepository.findByPostId(id);

        DetailBeforeDto detailBeforeDto =  new DetailBeforeDto(post, trade, construction, appliance);
        return detailBeforeDto;
//        DetailAfterDto detailAfterDto = new DetailAfterDto();

//        return mappingDto(detailBeforeDto, detailAfterDto);
    }

    private DetailAfterDto mappingDto(DetailBeforeDto detailBeforeDto, DetailAfterDto detailAfterDto) {

        detailAfterDto.getSaleInfo().setRoomType(detailBeforeDto.getConstruction().getRoomType());

        detailAfterDto.getAddressInfo().setRoad(detailBeforeDto.getConstruction().getAddress().getRoad());
        detailAfterDto.getAddressInfo().setOriginal(detailBeforeDto.getConstruction().getAddress().getOriginal());
        detailAfterDto.getAddressInfo().setLatitude(detailBeforeDto.getConstruction().getAddress().getLatitude());
        detailAfterDto.getAddressInfo().setLongitude(detailBeforeDto.getConstruction().getAddress().getLongitude());

//        detailAfterDto.getTradeInfo().setMonthlyDeposit(detailBeforeDto.getTrade().getTradeSales().get(0).getSale());
//        detailAfterDto.getTradeInfo().setMonthlyPay(detailBeforeDto.getTrade().getTradeSales().get(0).getSale().hashCode());
//        detailAfterDto.getTradeInfo().setYearlyDeposit(detailBeforeDto.getTrade().getTradeSales().get(1).getSale().hashCode());
//        detailAfterDto.getTradeInfo().setMonthly(detailBeforeDto.getTrade().getTradeSales().get(0).equals(true));
//        detailAfterDto.getTradeInfo().setYearly(detailBeforeDto.getTrade().getTradeSales().get(1).equals(true));

        detailAfterDto.getBasicInfo().setBuildingArea(detailBeforeDto.getConstruction().getBuildingArea());
        detailAfterDto.getBasicInfo().setFloor(detailBeforeDto.getConstruction().getFloor());
        detailAfterDto.getBasicInfo().setMovingDate(detailBeforeDto.getTrade().getMovingDate());

        detailAfterDto.getAdditionalInfo().setHasBalcony(detailBeforeDto.getConstruction().getDetailInfo().isHasbalcony());
        detailAfterDto.getAdditionalInfo().setHasBuiltIn(detailBeforeDto.getConstruction().getDetailInfo().isHasBuiltIn());
        detailAfterDto.getAdditionalInfo().setHasElevator(detailBeforeDto.getConstruction().getDetailInfo().isHasElevator());
        detailAfterDto.getAdditionalInfo().setHasPet(detailBeforeDto.getConstruction().getDetailInfo().isHasPet());
        detailAfterDto.getAdditionalInfo().setInnerType(detailBeforeDto.getConstruction().getDetailInfo().getInnerType());
        detailAfterDto.getAdditionalInfo().setLoanPossibility(detailBeforeDto.getTrade().isLoanPossibility());
        detailAfterDto.getAdditionalInfo().setManagementFee(detailBeforeDto.getTrade().getManagementFee());
        detailAfterDto.getAdditionalInfo().setParkingSpace(detailBeforeDto.getConstruction().getDetailInfo().isParkingSpace());

        detailAfterDto.getAppliance().setHasInduction(detailBeforeDto.getAppliance().isHasInduction());
        detailAfterDto.getAppliance().setHasMicrowave(detailBeforeDto.getAppliance().isHasMicrowave());
        detailAfterDto.getAppliance().setHasAirConditioner(detailBeforeDto.getAppliance().isHasAirConditioner());
        detailAfterDto.getAppliance().setHasWasher(detailBeforeDto.getAppliance().isHasWasher());
        detailAfterDto.getAppliance().setHasTv(detailBeforeDto.getAppliance().isHasTv());
        detailAfterDto.getAppliance().setHasCloset(detailBeforeDto.getAppliance().isHasCloset());
        detailAfterDto.getAppliance().setHasBed(detailBeforeDto.getAppliance().isHasBed());
        detailAfterDto.getAppliance().setHasDesk(detailBeforeDto.getAppliance().isHasDesk());
        detailAfterDto.getAppliance().setHasShoeCloset(detailBeforeDto.getAppliance().isHasShoeCloset());
        detailAfterDto.getAppliance().setHasBidet(detailBeforeDto.getAppliance().isHasBidet());
        detailAfterDto.getAppliance().setHasGasRange(detailBeforeDto.getAppliance().isHasGasRange());
        detailAfterDto.getAppliance().setHasRefrigerator(detailBeforeDto.getAppliance().isHasRefrigerator());
        detailAfterDto.getAppliance().setHasDoorLock(detailBeforeDto.getAppliance().isHasDoorLock());

        detailAfterDto.getDetailInfo().setTitle(detailBeforeDto.getPost().getTitle());
        detailAfterDto.getDetailInfo().setTitle(detailBeforeDto.getPost().getContents());

//        detailAfterDto.getImageUpload().setUrl(detailBeforeDto.getPost().getImgs()
//                .stream()
//                .map(Img -> new String())
//                .collect(Collectors.toList()));
        return detailAfterDto;
    }
}
