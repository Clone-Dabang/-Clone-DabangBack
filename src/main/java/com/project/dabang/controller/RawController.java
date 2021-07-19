package com.project.dabang.controller;


import com.project.dabang.domain.Img;
import com.project.dabang.domain.Post;
import com.project.dabang.domain.construction.Address;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.Construction;
import com.project.dabang.domain.construction.DetailInfo;
import com.project.dabang.domain.trade.Trade;
import com.project.dabang.domain.trade.sale.Monthly;
import com.project.dabang.domain.trade.sale.Yearly;
import com.project.dabang.dto.ApplianceRequestDto;
import com.project.dabang.dto.RawRequestDto;
import com.project.dabang.repository.*;
import com.project.dabang.service.RawService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class RawController {
    private final RawService rawService;

    @PostMapping("/api/roomposts") //게시물 작성
    public void createPost(@RequestBody RawRequestDto rawRequestDto) {
        rawService.register(rawRequestDto);

    }

//    @GetMapping("/api/post/{id}")
//    public int getPost (@PathVariable Long id){
//    }


}
