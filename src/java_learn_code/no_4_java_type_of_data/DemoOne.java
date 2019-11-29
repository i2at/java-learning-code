package java_learn_code.no_4_java_type_of_data;
/**
* 数据类型演示DemoOne类
* 2019/10/6
*/
public class DemoOne{
	public static void main(String[] args){
		//输出整数 十进制
		System.out.println(50);
		//输出整数 二进制，数字开头oB
		System.out.println(0B11);
		//输出整数 八进制，数字开头0
		System.out.println(0537);
		//输出整数 十六进制，数组开头0X 0-9 A-F
		System.out.println(0XE);
		
		//输出浮点数
		System.out.println(3.2);
		
		//输出布尔数据，只有2个值，true/false
		System.out.println(true);
		System.out.println(false);
		
		//输出字符常量，单引号包裹，只能写1个字符(无论是汉字、数组、字母)，都是一个字符。
		//注意：不写也不行，不写会报错，但可以写一个空字符。
		System.out.println('6');
		System.out.println(' ');
		
		//输出字符串。
		//注意：可以什么都不写，就为一个空字符。
		System.out.println("");
	}
}