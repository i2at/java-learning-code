package java_learn_code.no_12_java_basic_for_method;
/**
 * 计算长方形体积
 */
public class MethodsDemo01 {

	public static void main(String[] args) {
		//长方形：长
		int length =2;
		//长方形：宽
		int wight =5;
		//调用求和的方法
		int sum = getSum(length, wight);
		System.out.println(sum);
	}
	
	//求和方法
	public static int getSum(int length, int wight) {
		return 2*length + 2*wight;
	}

}
