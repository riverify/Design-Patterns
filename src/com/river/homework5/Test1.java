package com.river.homework5;

public class Test1 {
    public static void main(String[] args) {
        Customer customer = new Customer("芜湖");
        Customer customer1 = (Customer) customer.clone();
        Customer customer2 = (Customer) customer.deepClone();
        System.out.println("浅克隆：" + (customer.getAddress() == customer1.getAddress()));
        System.out.println("深克隆：" + (customer.getAddress() == customer2.getAddress()));


    }
}
