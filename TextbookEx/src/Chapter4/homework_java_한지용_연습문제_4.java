package Chapter4;

public class homework_java_한지용_연습문제_4 {

	public static void main(String[] args) {
		
		// 1.
		int num1 = 10;
		int num2 = 3;
		char operator = ';';
		
		switch (operator) {
			case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
			case '-': System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
			case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
			case '/': System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2)); break;
			default: System.out.println("사칙연산만 가능합니다."); break;
		}
		
		// 2.
		for (int i = 2; i < 9; i++) {
			if (i % 2 == 1) continue;
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		// 3.
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i < j) break;
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
		// 4.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 4 ; j++) {
				System.out.print(j < 3 - i ? " " : "*");
			}
			System.out.println();
		}
		
		// 5.
		for (int i = 0; i < 7; i++) {
			if (i < 4) {
				for (int j = 0; j < i + 4 ; j++) {
					System.out.print(j < 3 - i ? " " : "*");
				}
			}
			else {
				for (int j = 0; j < 10 - i; j++) {
					System.out.print(j < i - 3 ? " " : "*");
				}
			}
			System.out.println();
		}
		
		// 6.
		
		
		// 7.
		
		
		// 8.
		
		
		// 9.
		
		
		// 10.
		
		
		// 11.
		
		
		// 12.
		
		
		// 13.
		
		
		// 14.
		
		
		// 15.
		
		
		// 16.
		
		
		// 17.
		
		
		// 18.
		
		
	}
	
}
