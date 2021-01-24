package me.sungbin.ch07.quiz;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerVIP = new VIPCustomer(1001, "Lee");
        Customer customerGold1 = new GoldCustomer(2001, "Kim");
        Customer customerGold2 = new GoldCustomer(2002, "Cho");
        Customer customerSilver1 = new Customer(3001, "Park");
        Customer customerSilver2 = new Customer(3002, "Son");

        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(customerVIP);
        customerList.add(customerGold1);
        customerList.add(customerGold2);
        customerList.add(customerSilver1);
        customerList.add(customerSilver2);

        for (Customer customer : customerList) {
            customer.calcPrice(10000);
            System.out.println(customer.showCustomerInfo());
        }
    }
}
