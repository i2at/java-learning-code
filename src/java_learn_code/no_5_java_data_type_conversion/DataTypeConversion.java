package java_learn_code.no_5_java_data_type_conversion;
/**
* 数据类型转换
* 自动转换：取值范围小的数据值，会自动转换成取值范围大的值。
* 注意：bolean类型不能参与转换
* 2019/10/07
*/
public class DataTypeConversion{
	public static void main(String[] args){
		//double类型变量
		double d = 10000;  //出现类型自动转换，int自动转换成double
		System.out.println(d);
		
		int i =100;
		double d2 = i; //出现类型自动转换，int自动转换成double
		System.out.println(d2);
        
        byte b =10;
        int j = b; //自动类型转换，byte类型自动转换成int类型
        System.out.println(j);
	}
}