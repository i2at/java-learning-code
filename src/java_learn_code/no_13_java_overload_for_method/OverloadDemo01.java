package java_learn_code.no_13_java_overload_for_method;
/**
 * 方法重载
 * @author Jole
 *
 */
public class OverloadDemo01 {

	public static void main(String[] args) {
		int a =10;
		int b=5;
		System.out.println(sum(a,b));
		
		double x =2D;
		double y=6D;
		sum(x,a);
		sum(a,y);

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static void sum(int a, Double b) {
		System.out.println("a="+a);
	}
	
	public static void sum(double a, int b) {
		System.out.println("a="+a);
	}

}
