package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] scoreArrAsc = new int[5];			// 오름차순 정렬 배열
		int[] scoreArrDesc = new int[5];		// 내림차순 정렬 배열
		for (int i = 0; i < scoreArrAsc.length; i++) {
			int score = sc.nextInt();
			scoreArrAsc[i] = score;
			scoreArrDesc[i] = score;
		}
		
		// 삽입 오름차순 정렬
		for (int i = 1; i < scoreArrAsc.length; i++) {
			for (int j = i; j > 0; j--) {
				if (scoreArrAsc[j] < scoreArrAsc[j - 1]) {
					int temp = scoreArrAsc[j - 1];
					scoreArrAsc[j - 1] = scoreArrAsc[j];
					scoreArrAsc[j] = temp;
				}
				else {
					break;
				}
			}
		}
		
		// 오름차순 정렬 결과물 출력
		for (int score : scoreArrAsc) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// 삽입 내림차순 정렬
		for (int i = 1; i < scoreArrDesc.length; i++) {
			for (int j = i; j > 0; j--) {
				if (scoreArrDesc[j] > scoreArrDesc[j - 1]) {
					int temp = scoreArrDesc[j - 1];
					scoreArrDesc[j - 1] = scoreArrDesc[j];
					scoreArrDesc[j] = temp;
				}
				else {
					break;
				}
			}
		}
		
		// 내림차순 정렬 결과물 출력
		for (int score : scoreArrDesc) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
