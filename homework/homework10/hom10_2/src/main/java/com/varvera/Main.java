package com.varvera;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://api.apilayer.com/fixer/convert";
        String apiKty = "SUSkqYjmoBZLyRPjAbrbIVzGzodke4E0";

        Scanner scanner = new Scanner(System.in);
        System.out.println("From currency: ");
        String from = scanner.nextLine();
        System.out.println("To currency: ");
        String to = scanner.nextLine();
        System.out.println("Amount: ");
        String amount = scanner.nextLine();

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("apikey", apiKty);

        URI uri = UriComponentsBuilder.fromUriString(baseUrl)
                .queryParam("from",from)
                .queryParam("to",to)
                .queryParam("amount",amount)
                .build()
                .toUri();
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        System.out.println(response.getBody());


    }
}