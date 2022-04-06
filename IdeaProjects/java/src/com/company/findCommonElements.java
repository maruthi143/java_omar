package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class findCommonElements {
    private static void findCommon (LinkedList  listOne,LinkedList listTwo){
        Set<Integer> set= new HashSet<Integer>();
        for (int i=0; i< listOne.size();i++){
            for (int j=0; j<listTwo.size(); j++){
                Object a=listOne.get(i);
                Object b=listTwo.get(j);
                if(a==b){
                    set. add( (Integer) a);
                    break;
                }
            }
        }
        for ( int i:  set ){
            System.out.println(i + "");

        }
    }
    public static void main(String[] args){
        LinkedList listOne =new LinkedList();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);

        LinkedList listTwo =new LinkedList();
        listTwo.add(11);
        listTwo.add(1);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);

        System.out.println("Elements in 1st Linked list="+listOne);
        System.out.println("Elements in 2nd Linked list="+listTwo);
        findCommon(listOne,listTwo);

    }
}
