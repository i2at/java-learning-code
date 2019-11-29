package java_learn_code.no_11_java_basic_for_array;

public class ArrayDemo05 {

	public static void main(String[] args) {
		int[] arr = {1,2,4,52,4,3,6,};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		//......
		//如果有几千个，这样肯定不行，索引是依次加1的，因此可以用到循环来变量。
		
		//for：知道循环次数，计数器思想
		//while:不确定循环次数。
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
