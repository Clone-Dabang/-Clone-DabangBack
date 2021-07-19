package com.project.dabang.domain.trade;

import com.project.dabang.domain.Timestamped;
import com.project.dabang.dto.RawRequestDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Trade extends Timestamped {

    @Id
    @GeneratedValue
    @Column(name = "trade_id")
    private Long id;

    private String movingDate; // Localdatetime -> String

    private int managementFee;

    private boolean loanPossibility;

    public Trade(RawRequestDto rawRequestDto) {
        this.movingDate = rawRequestDto.getBasicInfo().getMovingDate();
        this.managementFee = rawRequestDto.getAdditionalInfo().getManagementFee();
        this.loanPossibility = rawRequestDto.getAdditionalInfo().isLoanPossibility();
    }
}
