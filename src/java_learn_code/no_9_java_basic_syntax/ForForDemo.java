package java_learn_code.no_9_java_basic_syntax;

public class ForForDemo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println("*");	
		}
	}
}
