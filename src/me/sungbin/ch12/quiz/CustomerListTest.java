package me.sungbin.ch12.quiz;

import java.util.ArrayList;

class CustomerList {

    private int customerNum;
    private String name;
    private int age;
    private int price;

    public CustomerList(int customerNum, String name, int age, int price) {
        this.customerNum = customerNum;
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return customerNum + ", " + name + ", " + age + ", " + price;
    }
}

public class CustomerListTest {
    public static void main(String[] args) {

        ArrayList<CustomerList> customerLists = new ArrayList<>();
        CustomerList customerLee = new CustomerList(1, "이순신", 40, 100);
        CustomerList customerKim = new CustomerList(2, "김유신", 20, 100);
        CustomerList customerHong = new CustomerList(3, "홍길동", 13, 50);
        customerLists.add(customerLee);
        customerLists.add(customerKim);
        customerLists.add(customerHong);

        customerLists.forEach(System.out::println);
        int sum = customerLists.stream().mapToInt(CustomerList::getPrice).sum();
        System.out.println(sum);

       customerLists.stream().filter(c -> c.getAge() >= 20).map(CustomerList::getName).sorted().forEach(System.out::println);
    }
}
