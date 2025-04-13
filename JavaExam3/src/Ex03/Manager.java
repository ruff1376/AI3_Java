package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		LinkedList<Student> sll = new LinkedList<>();
		sll = getTxtToList(sll);
		sll = sortScoreAndNo(sll);
		printList(sll);
	}

	// 텍스트 파일 입력
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
		try {
			File file = new File("./src/Ex03/student.txt");
			Scanner sc = new Scanner(file);
			Student std;
			while (sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data = stn.split("/");
				int no = Integer.parseInt(data[0]);
				String name = data[1];
				int score = Integer.parseInt(data[2]);
				String className = data[3];
				std = new Student(no, name, score, className);
				list.offer(std);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// 성적 내림차순 정렬 후 번호 오름차순 정렬
	public static LinkedList<Student> sortScoreAndNo(LinkedList<Student> list) {
		LinkedList<Student> newList = new LinkedList<>(list);
		newList.sort(
			Comparator.comparingInt(Student::getScore).reversed()		// 성적 내림차순 정렬
				   	  .thenComparingInt(Student::getNo)					// 이후 번호 오름차순 정렬
	    );
		return newList;
	}

	public static void printList(LinkedList<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
