package me.sungbin.ch05.classpart.quiz;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.orderNumber = "201907210001";
        shop.orderID = "abc123";
        shop.orderDate = "2019년 7월 21일";
        shop.orderName = "홍길순";
        shop.goodsNumber = "PD0345-12";
        shop.address = "서울시 영등포구 여의도동 20번지";

        shop.showOrderInfo();
    }
}
