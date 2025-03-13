package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최솟값을 구하시오.
		// (입력)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최솟값 : 55
		/*
		 * (순서도)
		 * 1. 정수 하나를 입력받아서 n에 대입
		 * 2. n개 요소를 갖는 배열 선언 및 생성
		 * 3. n번 반복하면서 정수를 입력받아서 배열 arr에 순서대로 대입
		 * 4. 배열을 반복해서 최댓값 min를 배열 i번째 요소랑 비교
		 * 5. 두 요소 중에서 더 큰 요소를 max 에 대입
		 * 6. 반복 끝나고, min 를 출력
		 * 
		 */
		// 1. 2.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), min, arr[] = new int[n];
		// 3.
		// n : 5
		// i : 0 1 2 3 4
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// 4.
		// Integer.MIN_VALUE : -21억xxx : int 의 최솟값
		min = arr[0];
		for (int i = 1; i < n; i++) {
			if (min > arr[i]) {
				// 5.
				min = arr[i];
			}
		}
		// 6.
		System.out.println("최솟값 : " + min);
		sc.close();
	}

}
