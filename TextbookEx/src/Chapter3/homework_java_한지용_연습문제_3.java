package Chapter3;

public class homework_java_한지용_연습문제_3 {

	public static void main(String[] args) {
		
		// 1. 1 : =, 2 : ==, 3 : ? 4 : :
		
		// 2. 10
		
		// 3. 1 : 10, 2 : 10, 3 : 11, 4 : 10
		
		// 4. 1 : false, 2 : true, 3 : false
		
		// 5. 1 : 2, 2 : 10, 3 : 8, 4 : -3
		
		// 6. 1 : 18, 2 : 8, 3 : 2
		
		// 7. 30
		
		// 8.
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
		// 9.
		int gameScore = 150;
		
		int lastScore1 = gameScore++;
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		// 10. 1 : true, 2 : 50, 3 : 10
		
		// 11. 1 : num1 += 5, 2 : num1 *= num2
		
		// 12. 1 : isEven, 2 : num % 2 == 0
		
		// 13. ++ > == > && > +=
		
		// 14.
		int a = 5;
		int reversed_a = ~a;
		
		System.out.println("원래 값: " + a);
		System.out.println("비트를 반대로 뒤집은 값: " + reversed_a);
		System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(a));
		System.out.println("이진수로 표현한 뒤집은 값: " + Integer.toBinaryString(reversed_a));
		
	}
	
}
