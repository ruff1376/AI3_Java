package _1351;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), e = sc.nextInt();
		for (int i = s; i <= e; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.println(i + "*" + (j + 1) + "=" + i * (j + 1));
			}
		}
		sc.close();
	}

}
