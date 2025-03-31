package Chapter4;

import java.util.Scanner;

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
		
		// 6. 1 : if, 2 : == 'F', 3 : else
		
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
		
		// 9. 1 : score >= 90, 2 : 'B'
		
		// 10.
		int floor = 5;
        String message = switch(floor) {

            case 1 -> "1층 약국입니다";
            case 2 -> "2층 정형외과입니다";
            case 3 -> "3층 피부과입니다";
            case 4 -> "4층 치과입니다";
            case 5 -> "5층 헬스 클럽입니다";
            default -> "1~5층을 눌러주세요";

        };
        System.out.println(message);
		
		// 11. 1 : while, 2 : num++;
		
		// 12. 1 : int n = 1;, 2 : n <= 10;, 3 : n++
		
		// 13.
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요" + (i + 1));
		}
		
		// 14.
		int dan;
		int times;
		
		for(dan = 3; dan <= 7; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
		// 15. 1 : num = 1, 2 : num <= 100, 3 : num % 3 != 0
		
		// 16. 1 : num++, 2 : if (sum >= 500), 3 : break;
		int sum = 0;
		int num;
		for (num = 1; ; num++) {
			sum += num;
			if (sum >= 500)
				break;
		}
		System.out.println(sum);	// 528
		System.out.println(num);	// 32
		
		// 17.
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n =  scanner.nextInt();
		System.out.println("1부터 " + n + "사이의 소수는");
		for (int i = 2; i <= n; i++) {
			if (i == 2) System.out.print(i + " ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) break;
				if (j == i - 1) System.out.print(i + " ");
			}
		}
		System.out.println("입니다");
		
		// 18.
		System.out.print("팩토리얼 계산할 숫자를 입력하세요: ");
		n = scanner.nextInt();
		int nFactorial = 1;
		for (int i = 0; i < n; i++) {
			nFactorial *= i + 1;
		}
		System.out.println(n + " 팩토리얼은 " + nFactorial + "입니다.");
		
		scanner.close();
	}
	
}
