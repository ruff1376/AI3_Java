package Chapter4;

public class homework_java_한지용_연습문제_4 {

	public static void main(String[] args) {
		
		// 1.
		int num1 = 10;
		int num2 = 3;
		char operator = '+';
		
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
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
		}
		
		// 7.
		int age = 65;
		int charge;
		
		if (age < 8) {
			charge = 1000; 
			System.out.println("취학 전 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}
		else if (age >= 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		} 
		
		System.out.println("입장료는 " + charge + "원입니다.");
		
		// 8.
		int score = 95;
		char grade;
		
		if (score >= 90 && score <= 100) grade = 'A';
		else if (score >= 80 && score <= 89) grade = 'B';
		else if (score >= 70 && score <= 79) grade = 'C';
		else if (score >= 60 && score <= 69) grade = 'D';
		else grade = 'F';
		
		System.out.println("학점은 " + grade + "입니다.");
		
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
