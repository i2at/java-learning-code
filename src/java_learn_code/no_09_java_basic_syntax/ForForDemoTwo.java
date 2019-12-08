package java_learn_code.no_09_java_basic_syntax;

public class ForForDemoTwo {

	public static void main(String[] args) {
		for(int i = 0;i < 5;i++) {
			for(int j = 5; j>i ;j--) {
				//控制行
				System.out.print("j ");
			}
			//控制列
			System.out.println("i");
		}

	}

}
