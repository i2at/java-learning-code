package java_learn_code.no_5_java_data_type_conversion;
/**
* 数据类型转换
* 强制转换：取值范围大的数据值，转换成取值范围小的值。
* 数据类型强制转换公式：被转后的数据类型 变量名 = (被转换后数据类型)要被转的数据
* 注意：强制类型转换，没有要求的时候，不做。不然会丢失精度 ，除非要求转换才做转换。
* 2019/10/07
*/
public class DataTypeConversion2{
	public static void main(String[] args){
		//double浮点，转成int
		double d = 3.14; 
		
		//被转后的数据类型 变量名 = (被转换后数据类型)要被转的数据
		int i = (int)d;
		
        System.out.println(i);
		
		//大桶中的水倒入小桶，水肯定会丢失（精度丢失）
		byte b = (byte)200;
		System.out.println(b);
	}
}