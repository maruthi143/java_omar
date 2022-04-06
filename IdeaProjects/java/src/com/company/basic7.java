package com.company;

import java.util.Scanner;

public class basic7 {
    public static void main(String args[]){
        //create a Scanner object
        Scanner sc=new Scanner(System.in);
        int totalCost=0;
        int unitPrice=10;
        int quantity=1;
        char wanttoAddFoodItem='Y';
        while (wanttoAddFoodItem=='Y'){
            totalCost=totalCost+(quantity*unitPrice);
            System.out.println("Order placed Successfully");
            System.out.println("Total Cost: "+totalCost);
            System.out.println("DO you want to add more food items to your order? Y or N");
            String input=sc.next();//Accpeting input from the customer
            //Extracting first char from input string
            wanttoAddFoodItem=input.charAt(0);
        }

    }
}
