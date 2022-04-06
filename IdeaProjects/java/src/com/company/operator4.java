package com.company;
import java.util.Scanner;
public class operator4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first  number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber=sc.nextInt();
        System.out.println("Enter Third Number");
        int thirdNumber=sc.nextInt();
        int biggernumber= firstNumber>secondNumber?firstNumber>thirdNumber?firstNumber:thirdNumber:secondNumber>thirdNumber?secondNumber:thirdNumber;
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second number: "+secondNumber);
        System.out.println("Third number: "+thirdNumber);
        System.out.println("Bigger Number: "+biggernumber);


    }
}