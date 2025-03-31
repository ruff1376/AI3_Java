package Chapter5.Q11;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
