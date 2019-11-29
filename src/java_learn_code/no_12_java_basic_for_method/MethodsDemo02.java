package java_learn_code.no_12_java_basic_for_method;
/**
 * 调用方法打印矩形
 * @author Jole
 *
 */
public class MethodsDemo02 {

	public static void main(String[] args) {
		//打印2行5列 矩形
		pritJuxing(2,5);
	}
	
	public static void pritJuxing(int m, int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
	}

}
