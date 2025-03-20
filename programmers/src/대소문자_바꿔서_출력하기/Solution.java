package 대소문자_바꿔서_출력하기;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (char c : arr)
			System.out.print(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        sc.close();
	}

}
