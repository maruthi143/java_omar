package com.company;
import java.util.Scanner;
public class operator2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        String res=n%2==0?"Even":"Odd";
        System.out.println(res);

    }
}
