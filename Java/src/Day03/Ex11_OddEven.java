package Day03;

public class Ex11_OddEven {

	public static void main(String[] args) {
		// 1~20 까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		// 1+3+5+...+19=???
		// 2+4+6+...+20=???
		
		// 순서도
		// 1. 1~20까지 반복
		// 2. 홀수인지 짝수인지 판별
		// 3. 홀수합계
		// 4. 짝수합계
		int i = 1, sum1 = 0, sum2 = 0;
		while(i <= 20) {
			// 홀수
			if(i % 2 == 1) {
				sum1 += i++;
			}
			// 짝수
			else {
				sum2 += i++;
			}
			// (i % 2 == 1) ? sum1 += i++ : sum2 += i++;
		}
		
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}

}
