package java_learn_code.no_04_java_type_of_data;
/**
* 基础数据类型测试
* byte 加int类型，但结果超出了byte范围，怎么办？
* 2019/10/09
*/
public class BasicDataTypeTest{
	public static void main(String[] args){
		//超出byte范围
		byte a =127;
		int b =100;
		a+=b; //a=a+b;
        System.out.println(a);
		
		//未超出byte范围
		byte m = 10;
		int n =100;
		m+=n;
		System.out.println(m);
		
		//+=与分开+ 的不同
		byte i =127;
		int j =100;
//		i=i+j;
        System.out.println(i);
		
	}
}