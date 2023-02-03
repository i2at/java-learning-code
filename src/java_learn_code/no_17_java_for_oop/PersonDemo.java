package java_learn_code.no_17_java_for_oop;

public class PersonDemo {
	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();
//		p.age = -20; // 给Person对象赋值
//		p.name = "人妖";
// 		p.setAge(10);
// 		p.show(); // 调用Person的show方法
	}
	
	int age;
	String name;

	public void show() {
		System.out.println("age=" + age + ",name" + name);
	}

}
