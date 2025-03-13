package _1231;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int resultInt;
		double resultDouble;
		if(s.contains("+")) {
			String[] n = s.split("\\+");
			resultInt = Integer.parseInt(n[0]) + Integer.parseInt(n[1]);
			System.out.println(resultInt);
		} else if(s.contains("-")) {
			String[] n = s.split("-");
			resultInt = Integer.parseInt(n[0]) - Integer.parseInt(n[1]);
			System.out.println(resultInt);
		} else if(s.contains("*")) {
			String[] n = s.split("\\*");
			resultInt = Integer.parseInt(n[0]) * Integer.parseInt(n[1]);
			System.out.println(resultInt);
		} else if(s.contains("/")) {
			String[] n = s.split("/");
			resultDouble = Double.parseDouble(n[0]) / Double.parseDouble(n[1]);
			System.out.printf("%.2f", resultDouble);	// 소수점 아래 n자리까지만 출력 : System.out.printf("%.nf", num);
		}
		
		sc.close();
	}
}
