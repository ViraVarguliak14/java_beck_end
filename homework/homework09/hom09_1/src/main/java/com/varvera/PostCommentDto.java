package com.varvera;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PostCommentDto {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
