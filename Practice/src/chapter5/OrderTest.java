package chapter5;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNumber = 201803120001L;
		order.orderID = "ruddus627";
		order.orderDate = "2018�� 3�� 12��";
		order.orderName = "�Ȱ濬";
		order.orderMerchandiseNumber = "PD345-12";
		order.arrivalAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order.orderNumber);
		System.out.println("�ֹ��� ���̵�: " + order.orderID);
		System.out.println("�ֹ� ��¥: " + order.orderDate);
		System.out.println("�ֹ��� �̸�: " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order.orderMerchandiseNumber);
		System.out.println("��� �ּ�: " + order.arrivalAddress);

	}

}
