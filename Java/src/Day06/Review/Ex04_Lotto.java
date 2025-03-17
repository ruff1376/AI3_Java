package Day06.Review;

import java.util.Arrays;

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		// Math.random() : 0.xxxxx ~ 0.9xxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		// (int) (Math.random() * 10)			: 0~9
		// (int) (Math.random() * 10 + 1)		: 1~10
		System.out.println("1~10 : " + (int) (Math.random() * 10 + 1));
		
		int dice = (int) (Math.random() * 6 + 1);
		System.out.println("주사위 : " + dice);
		
		// (공식) : (int) (Math.random() * [개수] + [시작숫자])
		
		// 1~20 사이의 랜덤수
		int random1 = (int) (Math.random() * 20 + 1);
		System.out.println(random1);
		
		// -20~20 사이의 랜덤수
		int random2 = (int) (Math.random() * 41 - 20);
		System.out.println(random2);
		
		// 1~45 사이의 랜덤수 6개를 배열에 저장하시오.
		int lotto[] = new int[6];
		
		// 중복제거
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = i - 1; j >= 0; j--) {
				// 중복
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// (과제) 오름차순 정렬
		// Arrays.sort(lotto);			// 내장 함수(sort) 사용
		
		// 버블 정렬 구현
		for (int i = 0; i < lotto.length - 1; i++) {
		    for (int j = 0; j < lotto.length - 1 - i; j++) {
		        if (lotto[j] > lotto[j + 1]) {
		            int temp = lotto[j];
		            lotto[j] = lotto[j + 1];
		            lotto[j + 1] = temp;
		        }
		    }
		}

		
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
