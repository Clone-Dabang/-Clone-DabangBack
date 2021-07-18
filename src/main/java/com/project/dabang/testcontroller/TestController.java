package com.project.dabang.testcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.dabang.dto.RawRequestDto;
import com.project.dabang.util.CustomJsonPassing;
import com.project.dabang.util.RequestJson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final CustomJsonPassing customJsonPassing;

    @PostMapping("/api/test")
    public void test(@RequestBody RawRequestDto rawRequestDto) throws JsonProcessingException {

        RequestJson requestJson = customJsonPassing.jasonPassingUsingGson(rawRequestDto);
        RequestJson.AddressInfoDetail saveAddressDto = new RequestJson.AddressInfoDetail();

        System.out.println("tradeInfo : "+ requestJson.getTradeInfoDetail());
        System.out.println("roomtype : "+ requestJson.saleInfoDetail.getRoomType());
    }
}
