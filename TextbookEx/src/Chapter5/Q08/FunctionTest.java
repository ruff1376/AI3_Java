package Chapter5.Q08;

public class FunctionTest {
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		int result = addNum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");
		result = subtractNum(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");
		result = multiplyNum(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");
		double result2 = divideNum(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + result2 + "입니다.");
		
	}

	public static int addNum(int n1, int n2) {
		
		int result = n1 + n2;
		return result;
		
	}
	
	public static int subtractNum(int n1, int n2) {
		
		int result = n1 - n2;
		return result;
		
	}
	
	public static int multiplyNum(int n1, int n2) {
		
		int result = n1 * n2;
		return result;
		
	}
	
	public static double divideNum(int n1, int n2) {
		
		double result = (double) n1 / n2;
		return result;
		
	}
	
	
	
}
