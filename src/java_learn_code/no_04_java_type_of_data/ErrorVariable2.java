package java_learn_code.no_04_java_type_of_data;
/**
* 变量使用注意事项演示
* 错误演示:变量有效范围
* 2019/10/07
*/
public class ErrorVariable2{
	public static void main(String[] args){
		{
			int i = 100;
		}
//		System.out.println(i);
	}
}