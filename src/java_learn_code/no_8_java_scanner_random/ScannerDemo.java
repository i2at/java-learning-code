package java_learn_code.no_8_java_scanner_random;
//导入包，指明类所在的的文件见，关键字import
import java.util.Scanner; 

/**
 * 引用数据类型,使用步骤：1、导入包 。2、创建对象  3、通过对象调用方法
 * @author Jole
 * Scanner的使用，所在目录java文件见-util文件夹
 */
public class ScannerDemo {

	public static void main(String[] args) {
		System.out.print("请输入整数内容：");
		//类型 变量名 = new 类型();
		//创建出scanner,类变量
		Scanner scan = new Scanner(System.in);
		//变量.功能方法，接受键盘输入
		//功能：nextint()接受键盘输入的是整数
		String str = scan.next();
		System.out.println("\n您输入的内容是："+str+1);
	}

}
