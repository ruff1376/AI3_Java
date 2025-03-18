package _2623;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int n = a < b ? a : b;
		for (int i = n; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
