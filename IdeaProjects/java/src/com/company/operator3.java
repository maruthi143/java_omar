package com.company;
import java.util.Scanner;
public class operator3{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first  number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber=sc.nextInt();
        int biggernumber= firstNumber>secondNumber?firstNumber:secondNumber;
        System.out.println("First Number: "+firstNumber);
        System.out.println("Second number: "+secondNumber);
        System.out.println("Bigger Number: "+biggernumber);


    }
}
