package java_learn_code.no_17_java_for_oop;
/**
 * 测试类
 * @author Jole
 *
 */
public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDemo02 p1 = new PersonDemo02();
		PersonDemo02 p2 = new PersonDemo02();
		p1.setAge(10);
		p2.setAge(25);
		
		System.out.println(p1.equalsAge(p2));
	}

}
