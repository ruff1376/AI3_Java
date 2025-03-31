package Chapter5.Q09;

public class Person {

	private int age;
	private String name;
	private boolean isMarried;
	private int numOfChildren;
	
	public Person(int age, String name, boolean isMarried, int numOfChildren) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.numOfChildren = numOfChildren;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
	
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public int getNumOfChildren() {
		return numOfChildren;
	}
	
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	@Override
	public String toString() {
		return "나이 : " + age + ", 이름 : " + name + ", 결혼 여부 : " + isMarried + ", 자녀 수 : " + numOfChildren;
	}
	
}
