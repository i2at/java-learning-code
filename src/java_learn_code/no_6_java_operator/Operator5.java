package java_learn_code.no_6_java_operator;
/**
* 三目运算符
*/
public class Operator5{
	public static void main(String[] args){
		int a =2;
		int b=6;
		System.out.println(a>b ? a+b : b-a);
		System.out.println(a<b ? a+b : b-a);
		
		String c = 9>4 ? "Hello" : "呵呵";
		System.out.println(c);
	}
}