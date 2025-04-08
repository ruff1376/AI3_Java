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
	
	public static LinkedList<Student> sortScoreAndNo(LinkedList<Student> list) {
		LinkedList<Student> newList = new LinkedList<>(list);
		newList.sort(
			Comparator.comparingInt(Student::getScore).reversed()
				   	  .thenComparingInt(Student::getNo)
	    );
		return newList;
	}

	public static void printList(LinkedList<Student> list) {
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
