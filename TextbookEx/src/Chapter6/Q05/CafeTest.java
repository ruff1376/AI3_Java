package Chapter6.Q05;

public class CafeTest {

	public static void main(String[] args) {
		
		CafeCustomer kim = new CafeCustomer("김삿갓", 10000);
		Cafe starbucks = new Cafe("별다방", "아메리카노", 4000);
		Cafe coffeeBean = new Cafe("콩다방", "라테", 4500);
		
		kim.buyBeverage(starbucks);
		System.out.println(kim);
		kim.buyBeverage(coffeeBean);
		System.out.println(kim);
		
	}

}
