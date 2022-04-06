package com.company;
import java.util.Scanner;

public class firstassignment {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int first_num=sc.nextInt();
        int second_num=sc.nextInt();
        int sum=first_num+second_num;
        if (first_num==second_num)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println(2*sum);
        }

    }
}

