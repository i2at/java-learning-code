package java_learn_code.no_09_java_basic_syntax;

import java.util.Scanner;

/**
 * if...else if...else
 * 多条件判断
 */
public class IfElseIfElseDemo {
	public static void main(String[] args) {
		while(true) {
			System.out.print("请输入分数:");
			Scanner scan = new Scanner(System.in);
			double sum = scan.nextDouble();
			if(sum<90) {
				System.out.print("可以哦");
			}else if(sum <=80) {
				System.out.println("合格");
			}else if(sum <=60){
				System.out.println("不及格");
			}else {
				System.out.println("分数有问题");
			}
			System.out.println("");
		}
	}
}
