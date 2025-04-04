package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scoreArr = new int[5];
		for (int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = sc.nextInt();
		}
		
		// 삽입 오름차순 정렬
		for (int i = 1; i < scoreArr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (scoreArr[j] < scoreArr[j - 1]) {
					int temp = scoreArr[j - 1];
					scoreArr[j - 1] = scoreArr[j];
					scoreArr[j] = temp;
				}
				else {
					break;
				}
			}
		}
		
		// 오름차순 정렬 결과물 출력
		for (int score : scoreArr) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 삽입 내림차순 정렬
		for (int i = 1; i < scoreArr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (scoreArr[j] > scoreArr[j - 1]) {
					int temp = scoreArr[j - 1];
					scoreArr[j - 1] = scoreArr[j];
					scoreArr[j] = temp;
				}
				else {
					break;
				}
			}
		}
		
		// 내림차순 정렬 결과물 출력
		for (int score : scoreArr) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
