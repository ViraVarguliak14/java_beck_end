package com.varvera;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI("https://jsonplaceholder.typicode.com/comments");
        RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET,uri);

        ResponseEntity<List<PostCommentDto>> response =
                restTemplate.exchange(request, new ParameterizedTypeReference<List<PostCommentDto>>() {});


        List<PostCommentDto> comments = response.getBody();
        if (comments != null) {
            for (PostCommentDto comment : comments) {
                System.out.println(comment);
                System.out.println();
            }
        }else {
            System.out.println("No comments found");
        }

    }
}