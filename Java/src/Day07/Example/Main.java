package Day07.Example;

public class Main {

	public static void main(String[] args) {
		Person person = new Student();		// 업 캐스팅
		System.out.println(person.age);		// 부모 클래스의 변수 호출
		person.work();						// 자식 클래스의 메소드가 우선 실행
		
		Student student = (Student) person;	// 다운 캐스팅 (업 캐스팅 전제 필수)
		System.out.println(student.age);	// 자식 클래스 변수 호출
		student.work();						// 자식 메소드 실행
	}

}
