package _1205;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		double max = a + b;
		double arr[] = {a + b, a - b, b - a, a * b, a / b, b / a, Math.pow(a, b), Math.pow(b, a)};
		for (int i = 0; i < arr.length - 1; i++) {
			if(max < arr[i + 1]) {
				max = arr[i + 1];
			}
		}
		System.out.printf("%f\n", max);
		sc.close();
	}
}
