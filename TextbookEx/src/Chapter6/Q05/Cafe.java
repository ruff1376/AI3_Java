package Chapter6.Q05;

public class Cafe {

	private String cafeName;
	private String beverage;
	private int price;
	
	public Cafe(String cafeName, String beverage, int price) {
		this.cafeName = cafeName;
		this.beverage = beverage;
		this.price = price;
	}
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
	
	
}
