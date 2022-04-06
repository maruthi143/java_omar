package com.company;

public class ifstmts3 {
    public static void main(String[]args){
        String CustomerType="NonRegular";
        String OrderFood="chickenBiryani";
        int quantity=10;
        int unitPrice=120;
        int totalCost=100000;
        int discountPercentage=20;
        int deliveryCharge= 10;

        if (CustomerType.equals("NonRegular")){

            totalCost = totalCost - (totalCost * (discountPercentage / 100));
            System.out.println("you are a regular customer20%DISCOUNT");
        }
        System.out.println("totalCost:   "+totalCost);
        System.out.println("unitPrice:    "+unitPrice);
        System.out.println("discountPercentage:");
        }

    }

