package Day06.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1~100 까지 수를 반복하여 출력하면서,
		// 해당 수가 3 또는 6 또는 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수 대신
		// "*" 을 출력하는 프로그램을 작성하시오.
		// ex)
		// 13 : *
		// 66 : *
		
		// 순서도
		// 1. 정수를 1~100 까지 출력
		// 2. 해당 수에 369가 몇 개인지 판단
		//	2-1. 십의 자리 수가 369인지 여부 판단 (A)
		//	2-2. 일의 자리 수가 369인지 여부 판단 (B)
		// 3. 369 개수에 따라 출력
		//	A and B -> **
		//	A or B -> *
		//	그 외 -> 정수
		
		for (int i = 1; i <= 100; i++) {
			// i : 1~100
			// ex) i : 16
			// 십의 자리수 : 해당수(i) / 10
			// 일의 자리수 : 해당수(i) % 10
			int a = i % 10, b = i / 10;
			
			boolean ten369 = b != 0 && b % 3 == 0;
			boolean one369 = a != 0 && a % 3 == 0;
			
			// 3 6 9
			if (one369 && ten369) {
				System.out.print("** ");
			}
			else if (one369 || ten369) {
				System.out.print("* ");
			}
			else {
				System.out.print(i + " ");
			}
			if (a == 0) {
				System.out.println();
			}
		}
	}

}
