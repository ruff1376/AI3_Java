package _1156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n % 2 == 1 ? "odd" : "even");
		sc.close();
		
		// 한 줄
//		System.out.println(new Scanner(System.in).nextInt() % 2 == 1 ? "odd" : "even");
	}

}
