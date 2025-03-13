package Day04;

import java.util.Scanner;

/*
 * 할 일 목록 프로그램
 * 
 * 최대 10개 할 일을 관리할 수 있는 프로그램으로,
 * 메뉴를 통해 할 일을 추가, 조회, 상태 변경을 할 수 있는 기능을 구현
 * 기능
 * 1. 할 일 추가
 * 2. 할 일 목록
 * 3. 상태 변경
 * 
 * """"작업 상태"""를 enum(열거타입)으로 정의하여 관리
 */

// 작업 상태를 나타내는 enum
/*
 * - 시작 전
 * - 진행 중
 * - 완료
 */
enum Status {
	TODO("시작 전"),
	ING("진행 중"),
	DONE("완료");
	
	private final String status;		// 상태의 값을 저장하는 상수

	// 생성자를 통해 상수의 값을 설정
	Status(String status) {
		this.status = status;
	}
	// 상태의 값을 반환하는 메소드
	public String getValue() {
		return status;
	}
}

class Todo {
	private String name;
	private Status status;
	
	public Todo(String name) {
		this.name = name;
		this.status = Status.TODO;		// 최초의 할 일의 상태는 TODO("시작 전")
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "(" + status + ") - " + name;
	}
	
	
}

public class Ex08_Todo {

	public static void main(String[] args) {
		Todo[] todoList = new Todo[10];			// 최대 10개의 할 일
		int count = 0;							// 할 일 개수
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("######### 할 일 목록 프로그램 #########");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 목록");
			System.out.println("3. 상태 변경");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			
			int menuNo = sc.nextInt();
			sc.nextLine();			// 남은 엔터 제거
			// TODO
			if(menuNo == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
			switch (menuNo) {
			case 1:	// 할 일 추가
				System.out.print("할 일 : ");
				String name = sc.nextLine();
				todoList[count++] = new Todo(name);		// 할 일 추가 및 개수 증가
				System.out.println("할 일을 추가하였습니다.");
				System.out.println();
				break;
			case 2:	// 할 일 목록
				System.out.println("========= 할 일 목록 =========");
				for (int i = 0; i < todoList.length; i++) {
					System.out.println((i+1) + ". " + todoList[i]);
				}
				System.out.println();
				break;
			case 3:	// 상태 변경
				System.out.print("할 일 번호 : ");
				int index = sc.nextInt() - 1;
				sc.nextLine();
				// 변경 가능한 상태 출력
				Status[] statusList = Status.values();
				for (Status status : statusList) {
					// 1. 시작 전
					// 2. 진행 중
					// 3. 완료
					System.out.println((status.ordinal() + 1) + ". " + status.getValue());
				}
				// 변경할 상태 번호 입력
				System.out.print("번호 : ");
				int statusNo = sc.nextInt();
				sc.nextLine();
				// 상태 변경
				Status updateStatus = statusList[statusNo - 1];
				todoList[index].setStatus(updateStatus);
				System.out.println("작업 상태를 " + updateStatus.getValue() + "(으/로) 변경하였습니다.\n");
				break;
			default:
				System.out.println("0~3 사이의 올바른 번호를 입력하세요.");
			}
		}
		
		sc.close();
	}

}
