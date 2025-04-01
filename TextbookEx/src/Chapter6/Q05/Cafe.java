package Chapter6.Q05;

public class Cafe {

	private String cafeName;
	private String beverage;
	private int price;
	private int sales;
	
	public Cafe(String cafeName, String beverage, int price, int sales) {
		this.cafeName = cafeName;
		this.beverage = beverage;
		this.price = price;
		this.sales= sales;	}
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public String getBeverage() {
		return beverage;
	}
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	@Override
	public String toString() {
		return "카페 이름 : " + cafeName + ", 판매 음료 : " + beverage + ", 음료 가격 : " + price + ", 매출 : " + sales;
	}
	
	
}
