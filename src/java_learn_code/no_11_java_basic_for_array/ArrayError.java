package java_learn_code.no_11_java_basic_for_array;

public class ArrayError {

	public static void main(String[] args) {
//		int[] arr = {1,2,4,};
//		//1、数组索引越界异常
//		System.out.println(arr[3]);
//		System.out.println(arr[-2]);
		//2、空指针异常
		int[] arr2 = {2,345,4};
		System.out.println(arr2[2]);;
		arr2 = null;
		System.out.println(arr2[2]);

	}

}
