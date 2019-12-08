package java_learn_code.no_10_java_basic_for_switch;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.print("星期转换：");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				flag = false;
				System.out.println("推出成功！");
			}
			System.out.println("");
		}
	}

}
