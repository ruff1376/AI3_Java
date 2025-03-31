package Chapter5.Q10;

public class Order {

	private int orderNum;
	private String id;
	private String date;
	private String name;
	private String productNum;
	private String address;
	public Order(int orderNum, String id, String date, String name, String productNum, String address) {
		this.orderNum = orderNum;
		this.id = id;
		this.date = date;
		this.name = name;
		this.productNum = productNum;
		this.address = address;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "주문 번호 : " + orderNum + "\n주문자 아이디 : " + id + "\n주문 날짜 : " + date + "\n주문자 이름 : " + name + "\n주문 상품 번호 : "
				+ productNum + "\n배송 주소 : " + address;
	}
	
	
	
}
