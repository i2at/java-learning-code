package java_learn_code.no_9_java_basic_syntax;
/**
 * 用for循环进行累加求和
 * @author Jole
 * 1+2+3+4...+100=?
 */
public class ForSum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}

}
