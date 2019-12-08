package java_learn_code.no_04_java_type_of_data;
/**
* 定义Java八种基本数据类型变量。
* 变量只能存一个值，以最后一个值为准。
* 2019/10/07
*/
public class DataType{
	public static void main(String[] args){
		//字节类型（127～-128） 1个字节
		byte b = 127;
		//短整型 2个字节
		short s = 128;
		//整型 4个字节
		int i =111111;
		//长整型 8个字节
		long l = 22222222222222L;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		//单精度 4个字节
		float f =1.176F;
		//双精度 8个字节
		double d =1.100D;
		System.out.println(f);
		System.out.println(d);
		
		//字符类型 2个字节
		//注意：必须有值，空字符也可以,必须单引号包裹起来。
		char c ='6';
	    //char c2 =''; 这个没有值，会报错。
		char c3 =' ';
		System.out.println(c);
		System.out.println(c3);
		
		//布尔类型 1个字节  只有2个值，true和false
		boolean boo = true;
		boolean boo2 = false;
		System.out.println(boo);
		System.out.println(boo2);
	}
}