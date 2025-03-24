package _1358;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n / 2 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
