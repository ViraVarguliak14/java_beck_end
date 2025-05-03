package com.varvera;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/*
{
        "confidence": 100,
            "tag": {
        "de": "Turbine",
                "en": "turbine"
    }
    },
 */
@NoArgsConstructor
@Getter
@ToString
public class TagDto {
    private double confidence;
    private Map<String, String> tag;



}
