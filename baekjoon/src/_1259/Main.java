package _1259;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(true) {
			String s = sc.next();
			if(s.equals("0")) {
				break;
			}
			list.add(s);
		}
		for(int i = 0; i < list.size(); i++) {
            int len = list.get(i).length();
            boolean isPalindrome = true;  // 펠린드롬 여부를 저장할 변수
            for(int j = 0; j < len / 2; j++) {
                int start = j, end = len - j - 1;
                if(list.get(i).charAt(start) != list.get(i).charAt(end)) {
                    isPalindrome = false;
                    break; // 펠린드롬이 아니면 더 이상 확인할 필요 없음
                }
            }
            
            if(isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
		sc.close();
	}

}
