package org.example;

import org.example.services.RelaxCalculateService;

public class Main {
    public static void main(String[] args) {
        RelaxCalculateService service = new RelaxCalculateService();
        int relaxAmountMonth = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Месяцев на отдых в год " + relaxAmountMonth);

    }
}