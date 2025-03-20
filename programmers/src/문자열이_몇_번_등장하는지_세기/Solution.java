package 문자열이_몇_번_등장하는지_세기;

public class Solution {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		int answer = 0;
		for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
			int i2 = i, cnt = 0;
			for (int j = 0; j < pat.length(); j++) {
				if (myString.charAt(i2) == pat.charAt(j)) {
					i2++;
					cnt++;
					if (cnt == pat.length()) {
						answer++;
					}
				}
				else {
					break;
				}
			}
			cnt = 0;
		}
		System.out.println(answer);
	}
}
