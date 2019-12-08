package java_learn_code.no_6_java_operator;
/**
* 算术运算符：
* + 加法，连
* - 减法
* * 乘法
* / 除法
* % 取模（求余数）
* ++ 自增
* -- 自减
*/
public class Operator{
	public static void main(String[] args){
		// + 连接作用，将一个字符串和其他数据连接起来
		// 遇到字符串，变成连"5+4=54"
		// + 任何类型只要和字符串+,所有的数据都变成了字符串。
		System.out.println("5+4="+5+4);
		
		//除法运算
		//java中，整数除法运算最后只会得到整数
		int i = 100;
		int j = 9;
		System.out.println(i/j);
		
		//取模运算，两数相除，获取的余数
		int k =6;
		int m =4;
		System.out.println(k%m);
		
		//++/-- 自增/自减运算
		int a = 3;
		int b = 3;
		
		a++; //变量a自己增加1
		System.out.println(a);
		
		++b;
		System.out.println(b);
		//======================================================
		//++：写在变量前面，和写在后面的，区别
		int c = 3;
		int d = 3;
		++c;
		d++;
		//结论：符号写在前面，还是后面，在变量自己独立计算的时候，没有区别。
		//但是变量，要是参与了其它运算，就有区别了。
		//f = e++,++后算，先将e的值赋予f，然后e再自增1.
		//q = ++h,++先算，先将h自增1，后再赋值给q。
		//======================测试============================
		int e = 5;
		int f = e++;
		System.out.println(e);
		System.out.println(f);
		
		int h = 5;
		int q = ++h;
		System.out.println(h);
		System.out.println(q);
		
	}
}