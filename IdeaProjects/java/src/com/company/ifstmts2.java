package com.company;

public class ifstmts2 {
    public static void main(String[] args) {
        String customerType = "Regular";
        String OrderedFood = "panipuri";
        int quantity = 2;
        int unitPrice = 100;
        int totalCost =1000;
        int discontPercentage = 5;
        int deliveryCharge = 10;

        if (customerType.equals("Regular")) {
            int discountPercentage = 15;
            totalCost = totalCost - (totalCost*(discountPercentage / 100));
            System.out.println("you are a regular customer and egilible for 15% discount ");

        }
        System.out.println("totalCost:   " + totalCost);
    }
}
        
    

