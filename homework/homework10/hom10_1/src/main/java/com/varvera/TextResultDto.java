package com.varvera;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@NoArgsConstructor
@ToString
public class TextResultDto {
    private List<TextLineDto> text;
}
