package java_learn_code.no_13_java_overload_for_method;
/**
 * 引用数据类型
 * @author Jole
 *
 */
public class BasicDataTypeTwo {

	public static void main(String[] args) {
		int [] arr = {1,2,43,4};
// 		System.out.println(arr[2]);
		change(arr);
// 		System.out.println(arr[2]);
	}
	public static void change(int[] a) {
		a[2]=100;
	}

}
