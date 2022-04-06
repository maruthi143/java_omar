package com.company;
import java.time.LocalDate;

 public class LocalDateDemo {
    public static void main(String args[]){
        LocalDate today=     LocalDate.now();
        LocalDate yesterday=  today.minusDays(1);
        LocalDate tomorrow=today.plusDays(1);
        System.out.println("Today= "+today);
        System.out.println("Yesterday= "+yesterday);
        System.out.println("Tomorrow= "+tomorrow);
    }
}



