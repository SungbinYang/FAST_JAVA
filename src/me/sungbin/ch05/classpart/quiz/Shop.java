package me.sungbin.ch05.classpart.quiz;

public class Shop {
    String orderNumber;
    String orderID;
    String orderDate;
    String orderName;
    String goodsNumber;
    String address;

    public void showOrderInfo() {
        System.out.println("주무 번호: " + orderNumber);
        System.out.println("주문자 아이디: " + orderID);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + orderName);
        System.out.println("주문 상품 번호: " + goodsNumber);
        System.out.println("배송 주소: " + address);
    }
}
