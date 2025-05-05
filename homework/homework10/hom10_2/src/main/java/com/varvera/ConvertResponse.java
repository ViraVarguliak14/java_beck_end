package com.varvera;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class ConvertResponse {
    private Query query;
    private Info info;
    private String date;
    private double result;
}

