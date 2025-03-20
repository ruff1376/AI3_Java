package 문자열_뒤집기;

public class Solution {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3"	;
		int s = 6, e = 12;
		char[] arr = my_string.toCharArray();
		char[] temp = new char[e - s + 1];
		for (int i = e; i >= s; i--) {
			temp[e - i] = arr[i];
		}
		for (int i = s; i <= e; i++) {
			arr[i] = temp[i - s];
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}

}
