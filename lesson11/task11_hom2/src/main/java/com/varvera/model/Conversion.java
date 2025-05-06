package com.varvera.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Conversion {
    private String from;
    private String to;
    private BigDecimal amountFrom;
    private BigDecimal amountTo;
    private BigDecimal rate;
    private LocalDateTime timeStamp;

    public Conversion (String from, String to, BigDecimal amountFrom) {
        this.from = from;
        this.to = to;
        this.amountFrom = amountFrom;
        this.timeStamp = LocalDateTime.now();
    }
}
