package com.company;
import java.util.Scanner;

public class operator5 {
    public static void main  (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber=sc.nextInt();
        System.out.println("enter Second nuber");
        int secondNumber=sc.nextInt();
        int biggerNumber=firstNumber>secondNumber?firstNumber:secondNumber;
        System.out.println("first number:   "+firstNumber);
        System.out.println("SecondNumber:   "+secondNumber);
        System.out.println("biggerNumber:  "+biggerNumber);

    }
}
