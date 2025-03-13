package _1226;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[7], jihye[] = new int[6], match = 0, result;
		for (int i = 0; i < 7; i++) {
			lotto[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			jihye[i] = sc.nextInt();
		}
		for (int i : jihye) {
			for (int j = 0; j < 6; j++) {
				if(i == lotto[j]) {
					match++;
					break;
				}
			}
		}
		if(match == 3 || match == 4) {
			result = 8 - match;
		}
		else if(match == 6) {
			result = 1;
		}
		else if(match == 5) {
			result = 3;
			for (int i : jihye) {
				if(i == lotto[6]) {
					result = 2;
					break;
				}
			}
		}
		else {
			result = 0;
		}
		System.out.println(result);
		sc.close();
	}

}
