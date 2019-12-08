package java_learn_code.no_09_java_basic_syntax;

public class BreakDemo {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i==3) {
				break;
			}else {
				System.out.println("i="+i);
			}
			i++;
		}
	}

}
