package com.varvera;


import com.varvera.model.Conversion;
import com.varvera.service.Converter;
import com.varvera.service.ConverterFixerImpl;
import com.varvera.service.RateCacheMapImpl;
import com.varvera.service.cache.CachedConverterImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new CachedConverterImpl(new ConverterFixerImpl(), new RateCacheMapImpl());
        while (true) {
            System.out.println("Enter currency from: ");
            String from = scanner.nextLine().trim().toLowerCase();
            System.out.println("Enter currency to: ");
            String to = scanner.nextLine().trim().toLowerCase();
            System.out.println("Enter sum: ");
            double sum = scanner.nextDouble();
            scanner.nextLine();
            try {
                Conversion result = converter.convert(from, to, sum);
                System.out.printf("%s %s = %s %s%n", result.getAmountFrom(),
                        result.getFrom(),
                        result.getAmountTo(),
                        result.getTo());
            } catch (Exception e) {
                System.out.println("Error");
            }
            System.out.println("exit?");
            if (scanner.nextLine().equals("yes")) {
                break;
            }
        }
    }
}
