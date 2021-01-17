package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNumber = 201803120001L;
		order.orderID = "ruddus627";
		order.orderDate = "2018년 3월 12일";
		order.orderName = "안경연";
		order.orderMerchandiseNumber = "PD345-12";
		order.arrivalAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order.orderNumber);
		System.out.println("주문자 아이디: " + order.orderID);
		System.out.println("주문 날짜: " + order.orderDate);
		System.out.println("주문자 이름: " + order.orderName);
		System.out.println("주문 상품 번호: " + order.orderMerchandiseNumber);
		System.out.println("배송 주소: " + order.arrivalAddress);

	}

}
