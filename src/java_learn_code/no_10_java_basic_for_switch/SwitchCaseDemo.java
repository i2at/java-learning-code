package java_learn_code.no_10_java_basic_for_switch;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.print("星期转换：");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("工作日");
				break;
			case 6:
			case 7:
				System.out.println("休息日");
				break;
			default:
				flag = false;
				System.out.println("推出成功！");
			}
			System.out.println("");
		}
	}
}
