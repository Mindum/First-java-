package ch08;

public class order {
	
	
	public String orderNumber;
	public String orderpNumber;
	public String orderadress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String menuNumber;
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : "  + orderNumber);
		System.out.println("주문 핸드폰 번호 : "  + orderpNumber);
		System.out.println("주문 집 주소 : "  + orderadress);
		System.out.println("주문 날짜 : "  + orderDate);
		System.out.println("주문 시간 : "  + orderTime);
		System.out.println("주문 가격 : "  + orderPrice);
		System.out.println("메뉴 번호 : "  + menuNumber);
	}
	
	
	
}
