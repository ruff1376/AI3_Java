package _1161;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a % 2 == 1 && b % 2 == 1) {
			System.out.println("홀수+홀수=짝수");
		} else if(a % 2 == 1 && b % 2 == 0){
			System.out.println("홀수+짝수=홀수");
		} else if(a % 2 == 0 && b % 2 == 1){
			System.out.println("짝수+홀수=홀수");
		} else {
			System.out.println("짝수+짝수=짝수");
		}
		sc.close();
	}

}
