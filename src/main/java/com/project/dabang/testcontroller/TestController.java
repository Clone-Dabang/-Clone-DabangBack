package com.project.dabang.testcontroller;

import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Address;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.DetailInfo;
import com.project.dabang.domain.construction.InnerType;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.TradeSale;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.dto.RawRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @PostMapping("/api/test")
    public void test(@RequestBody RawRequestDto rawRequestDto) {
        // Address
        Address address = new Address(rawRequestDto);
        String road = address.getRoad();
        String original = address.getOriginal();
        System.out.println("road : " + road);
        System.out.println("original : " + original);

        // Appliance
        Appliance appliance = new Appliance(rawRequestDto);
        boolean induction = appliance.isHasInduction();
        System.out.println("induction : " + induction);

        // Detailinfo
        DetailInfo detailInfo = new DetailInfo(rawRequestDto);
        InnerType innerType = detailInfo.getInnerType();
        System.out.println("innerType : " + innerType);
        System.out.println();

        // 1:M M:1 관계 잘들어오는지 확인
        Monthly monthly = new Monthly(rawRequestDto);
        System.out.println(monthly);
        TradeSale tradeSale = TradeSale.createTradeSale(monthly);
        System.out.println(tradeSale);
        Trade trade = Trade.createTrade(rawRequestDto,tradeSale);
        System.out.println(trade.getId());
        System.out.println(trade.getManagementFee());
        System.out.println(trade.getTradeSales());

        //
        Post post1 = Post.createPost(rawRequestDto);
        System.out.println(post1);
        List<String> urls = rawRequestDto.getImageUpload().getUrl();
        System.out.println(urls);
//        Post post = new Post(rawRequestDto);
//        String img = Img.createImg(rawRequestDto);
//        System.out.println(img);
//        System.out.println(post.getTitle());
//        System.out.println(post.getContents());

    }
}
