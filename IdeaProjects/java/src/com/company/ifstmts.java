
        package com.company;

        public class ifstmts {
            public static void main(String args[]){

                //consider the code which calculates and displays the total cost of food ordered by customer
                //based on the  customer type and food ordered.
                String customerType="Regular";
                String orderedFood="Pizza";
                int quantity=1;
                int unitPrice=10;
                int totalCost=0;
                int discountPercentage=5;
                int deliveryCharge=5;

                if(customerType.equals("Regular")){
                    totalCost=totalCost-(totalCost*(discountPercentage/100));
                    System.out.println("You are a regular customer and eligble for 5% discount");
                }

                System.out.println("Total Cost: "+totalCost);

            }
        }




