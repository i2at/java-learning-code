package java_learn_code.no_06_java_operator;
/**
* 赋值运算符
× 运算时，都会想字节大的转换，除，余数都去整数。
*/
public class Operator2{
	public static void main(String[] args){
		int a = 1;
		a+=4.8;
		System.out.println(a);
		
		int b = 10;
		b%=3.3;  //会先把10转成double 10.0 然后相除余数0.1，去整数0.
		System.out.println(b);
		
		int h = 10;
		//h=h%3.3;  会报 不兼容的类型: 从double转换到int可能会有损失
		System.out.println(h);
		
		int c = 10;
		double d=3.3;
		System.out.println(c/d);
		System.out.println(c%d);
		
		byte m =1;
		//m = m + 1; //出错，会丢失精度，类似把小桶加大桶的水，放到小桶。
		m=(byte)(m+1);//通过强转就可以。
		
		m+=1;//这种加就包含了上面的强转，因此推荐使用+=这种
		System.out.println(m);
	}
}