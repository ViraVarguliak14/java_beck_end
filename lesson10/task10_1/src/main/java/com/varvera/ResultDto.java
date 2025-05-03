package com.varvera;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@Getter
@ToString
public class ResultDto {
    private List<TagDto> tags;
}
