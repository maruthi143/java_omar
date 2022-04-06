package com.company;
import java.util.Collections;
import java.util.ArrayList;
   import java.util.LinkedList;
   import java.util.List;

 class Tester{
       public static List<Object>concatenateLists(List<Object>listOne,List<Object> ListTwo) {
           String list=listOne+" "+ListTwo;
           // implement your logic here and change the return statement accordingly return null;
          return Collections.singletonList(list);

       }


       public static  void main(String args[]){
               List<Object> listOne= new LinkedList<Object>();
                   listOne.add("Hello");
                   listOne.add(102);
                   listOne.add(25);
                   listOne.add(38.5);


                       List<Object> listTwo= new LinkedList<Object>();
                   listTwo.add("welcome");
                   listTwo.add("A");
                   listTwo.add(200);
                   listTwo.add(150);
                   List<Object> concatenatedList=concatenateLists(listOne,listTwo);

                   System.out.println("concatenated linked list");
                   for(Object value:concatenatedList)
                   {
                       System.out.println(value+"");


                       }
           }

   }



