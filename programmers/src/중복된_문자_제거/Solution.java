package 중복된_문자_제거;

public class Solution {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (!answer.contains(Character.toString(my_string.charAt(i)))) {
				answer += Character.toString(my_string.charAt(i));
			}
		}
		System.out.println(answer);
	}
}
