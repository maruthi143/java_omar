package com.company;

public class basic9 {
    public   String CustomerId;
    public String CustomerName;
    public Long contactNumber;
    public String address;

    public  void init(String cid,String cName,long cNum,String addr){
        CustomerId=cid;
        CustomerName=cName;
        contactNumber=cNum;
        address=addr;
    }
    public void displayCustomerDetails(){
        System.out.println("---------------Displaying Customer Details--------");
        System.out.println("customer Id: +customerId");
        System.out.println("customer name: +customerName");
        System.out.println("customer number: +customer Number");
        System.out.println("address:  +address");
    }
}
