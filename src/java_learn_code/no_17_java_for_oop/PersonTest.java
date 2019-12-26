package java_learn_code.no_17_java_for_oop;

public class PersonTest {
	private int age;
	private String name;
	
	public void speak() {
		this.name = "小强";
		this.age = 18;
		System.out.println("name=" + this.name + ",age=" + this.age);
	}
}

class Persons {
	public static void main(String[] args) {
		PersonTest p = new PersonTest();
		p.speak();
	}
}

