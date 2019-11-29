package java_learn_code.no_11_java_basic_for_array;

public class ArrayDemo03 {

	public static void main(String[] args) {
		//定义方式一
		int[] arr = new int[] {1,3,4,5};
		System.out.println(arr.length);
		//注意：new 后面的中括号中，不允许写任何内容，写了就编译失败。
		//错误实例：
		//int[] arr = new int[4]{1,23,4,5,3,4,3};
		
		//定义方式二（这种比较简单，常用）
		int[] arr2 = {1,2,3,4,};
		//注意：最后一个逗号，会自动去掉
		System.out.println(arr2.length);
	}

}
