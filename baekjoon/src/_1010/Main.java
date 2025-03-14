package _1010;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n[] = new int[t], m[] = new int[t];
		long result[] = new long[t], result1[] = new long[t], result2[] = new long[t];
		Arrays.fill(result1, 1);
		Arrays.fill(result2, 1);
		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {
			if (n[i] > m[i] / 2) {
				for (int j = m[i]; j > n[i]; j--) {
					result1[i] *= j;
					result2[i] *= j - (m[i] - n[i]);
				}
			}
			else {
				for (int j = m[i]; j > m[i] - n[i]; j--) {
					result1[i] *= j;
					result2[i] *= j - (m[i] - n[i]);
				}
			}
			result[i] = result1[i] / result2[i];
		}
		
		for (long i : result) {
			System.out.println(i);
		}
		sc.close();
	}
}
