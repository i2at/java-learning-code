package java_learn_code.no_9_java_basic_syntax;

import java.util.Random;
import java.util.Scanner;

public class DemoOne {

	public static void main(String[] args) {
		while(true) {
			System.out.print("请输入猜的数字：");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			Random ran = new Random();
			int yourNum = ran.nextInt(10)+1;
			if(number==yourNum) {
				System.out.println("恭喜你猜对了，么么哒！");
				break;
			}else if(number>yourNum) {
				System.out.println("输入的值："+number);
				System.out.println("随机值："+yourNum);
				System.out.println("sorry....猜大了哦");
			}else {
				System.out.println("输入值："+number);
				System.out.println("随机值："+yourNum);
				System.out.println("sorry....猜小洛");
			}
			System.out.println("");
		}
	}

}
