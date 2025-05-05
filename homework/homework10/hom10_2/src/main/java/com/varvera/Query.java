package com.varvera;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class Query {
    private String from;
    private String to;
    private double amount;
}