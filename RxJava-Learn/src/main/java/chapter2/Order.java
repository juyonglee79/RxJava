package chapter2;

public class Order {
	private String mid;
	
	public Order(String id) {
		mid = id;
	}
	public String getId() {
		return mid;
	}
	@Override
	public String toString() {
		return "Order ID : " +mid;
	}
}
