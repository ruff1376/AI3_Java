package _1508;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), arr[][] = new int[n][n], size[] = new int[4];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
		}
		for (int j = 0; j < n - 1; j++) {
			for (int i = j; i < n - 1; i++) {
				arr[i + 1][j + 1] = arr[i + 1][j] - arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
