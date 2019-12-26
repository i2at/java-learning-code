package java_learn_code.no_17_java_for_oop;

public class Person {
	private int age;
	private String name;

	public void show() {
		System.out.println("age=" + age + ",name" + name);
	}

	// 对外提供设置成员变量的方法
		public void setAge(int a) {
			// 由于是设置成员变量的值，这里可以加入数据的验证
			if (a < 0 || a > 130) {
				System.out.println(a + "不符合年龄的数据范围");
				return;
			}
			age = a; 
		}

		// 对外提供访问成员变量的方法
		public int getAge() {
			return age;
		}

}
