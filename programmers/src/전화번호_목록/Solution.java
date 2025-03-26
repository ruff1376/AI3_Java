package 전화번호_목록;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
    	String[] phone_book = {"12","123","1235","567","88"};
//        HashMap<String, Boolean> map = new HashMap<>();
//
//        // 모든 전화번호를 HashMap에 저장
//        for (String number : phone_book) {
//            map.put(number, true);
//        }
//
//        // 각 전화번호의 모든 접두어가 존재하는지 확인
//        for (String number : phone_book) {
//            for (int i = 1; i < number.length(); i++) { // 부분 문자열 탐색
//                if (map.containsKey(number.substring(0, i))) {
//                	System.out.println(false);
//                    return; // 접두어가 존재하면 false 반환
//                }
//            }
//        }
//        System.out.println(true);
    	Set<String> set = new HashSet<>();
    	for (String number : phone_book) {
    		set.add(number);
    	}
    	
    	for (String number : phone_book) {
    		for (int i = 1; i < number.length(); i++) {
    			if (set.contains(number.substring(0, i))) {
    				System.out.println(false);
    				return;
    			}
    		}
    	}
    	System.out.println(true);
    }
}
