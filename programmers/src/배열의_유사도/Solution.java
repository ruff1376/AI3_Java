package 배열의_유사도;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
		Set<String> set = new HashSet<>();
		for (String s : s1) {
			set.add(s);
		}
		for (String s : s2) {
			if (set.contains(s)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
