package 모의고사;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] spj1 = new int[answers.length];
		int[] spj2 = new int[answers.length];
		int[] spj3 = new int[answers.length];
		int[] count = new int[3];
		Arrays.fill(count, 0);
		for (int i = 0; i < answers.length; i++) {
			int t1 = i % 5;
			int t2 = i % 8;
			int t3 = i % 10;
			
			spj1[i] = t1 + 1;
			
			if (t2 % 2 == 0) {
				spj2[i] = 2;
			}
			else if (t2 == 1) {
				spj2[i] = 1;
			}
			else if (t2 == 3) {
				spj2[i] = 3;
			}
			else if (t2 == 5) {
				spj2[i] = 4;
			}
			else {
				spj2[i] = 5;
			}
			
			if (t3 < 2) {
				spj3[i] = 3;
			}
			else if (t3 < 4) {
				spj3[i] = 1;
			}
			else if (t3 < 6) {
				spj3[i] = 2;
			}
			else if (t3 < 8) {
				spj3[i] = 4;
			}
			else {
				spj3[i] = 5;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == spj1[i]) {
				count[0]++;
			}
			if (answers[i] == spj2[i]) {
				count[1]++;
			}
			if (answers[i] == spj3[i]) {
				count[2]++;
			}
		}
		ArrayList<Integer> spj = new ArrayList<>();
		int max = Arrays.stream(count).max().getAsInt();
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				spj.add(i + 1);
			}
		}
		int[] result = new int[spj.size()];
		for (int i = 0; i < spj.size(); i++) {
			result[i] = spj.get(i);
		}
	}

}
