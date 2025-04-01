package 완주하지_못한_선수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
        Set<String> set = new HashSet<>();
        for (String runner : completion) {
			set.remove(runner);
		}
        LinkedList<String> ll = new LinkedList<>(set);
        return ll.getFirst();
    }
}
