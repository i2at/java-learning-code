package java_learn_code.no_13_java_overload_for_method;
/**
 * 方法参数是基本数据类型
 * @author Jole
 *
 */
public class BasicDataType {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		say(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void say(int a, int b) {
		a = a+b;
		b = b+a;
	}

}
