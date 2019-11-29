package java_learn_code.no_9_java_basic_syntax;
/**
 * if..else 与三元运算符的转换
 */
public class IfAllDemo {

	public static void main(String[] args) {
		int m = 10;
		int n = 8;
		//if...else运算
		if(m>n) {
			System.out.println(m);
		}else {
			System.out.println(n);
		}
		
		//三元运算符运算
		System.out.println(m>n ? m : n);
	}

}
