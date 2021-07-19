package com.project.dabang.testcontroller;

import com.project.dabang.domain.construction.Address;
import com.project.dabang.domain.construction.Appliance;
import com.project.dabang.domain.construction.DetailInfo;
import com.project.dabang.domain.construction.InnerType;
import com.project.dabang.dto.RawRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/api/test")
    public void test(@RequestBody RawRequestDto rawRequestDto) {
        Member member = new Member(rawRequestDto);
        String title = member.getTitle();
        String contents = member.getContents();
        System.out.println("title : " + title);
        System.out.println("contents : " + contents);

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

        //

    }
}
