package java_learn_code.no_06_java_operator;
/**
* 逻辑运算符
*/
public class Operator4{
	public static void main(String[] args){
		//一边是false，运算结果就是false
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println(true & true);

		//一边是true，结果就是true
		System.out.println(false | false);
		System.out.println(false | true);
		System.out.println(true | true);
		
		////两相同就是false,不同为true
		System.out.println(false ^ false);
		System.out.println(false ^ true);
		System.out.println(true ^ true);
		
		//取反
		System.out.println(!false);
		System.out.println(!true);
		
		//前边是false，后边不运行，结果为false。比&效率高
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && true);
		
		//前边是true，后边不运行，结果为true。比|效率高
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || true);
	}
}