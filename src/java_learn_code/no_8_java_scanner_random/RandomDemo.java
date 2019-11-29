package java_learn_code.no_8_java_scanner_random;
//导入类所在的包，知道sun为我们写好的类所在位置
import java.util.Random;
import java.util.stream.DoubleStream;
/**
 * 随机数类Random引用类型的使用,产生随机整数\浮点数
 * 使用步骤：1、导入包 2、创建对象  3、通过对象.方法() 进行使用
 * 随机数，都是伪随机数，因为都是人编写的算法，而产生的随机数
 */
public class RandomDemo {

	public static void main(String[] args) {
		//创建Random对象
		Random ran = new Random();
		//产生随机整数
		//调用对象的方法nexInt(),产生整数，加参数表示产生0-参数内的整数
		//注释不包含参数本身，例如nextInt(100),表示产生0-99中的整数。
		int i = ran.nextInt(100);
		System.out.println(i);
		
		//产生随机浮点数
		Random random = new Random();
		double d =random.nextDouble();
		System.out.println(d);
	}

}
