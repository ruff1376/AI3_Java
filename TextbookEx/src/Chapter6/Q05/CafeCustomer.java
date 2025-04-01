package Chapter6.Q05;

public class CafeCustomer {

	private String name;
	private int money;
	private String beverage;
	public CafeCustomer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBeverage() {
		return beverage;
	}
	public void setBeverage(String beverage) {
		this.beverage = beverage;
	}
	
	public void buyBeverage(Cafe cafe) {
		if (beverage == null) beverage = cafe.getBeverage();
		else beverage += ", " + cafe.getBeverage();
		money -= cafe.getPrice();
		cafe.setSales(cafe.getSales() + cafe.getPrice());
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 남은 돈 : " + money + ", 구매한 음료 : " + beverage;
	}
	
	
}
