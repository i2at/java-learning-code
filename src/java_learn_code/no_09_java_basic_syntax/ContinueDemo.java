package java_learn_code.no_09_java_basic_syntax;

public class ContinueDemo {

	public static void main(String[] args) {
		for (int j = 1; j < 7; j++) {
			if (j == 4) {
				continue;
			} else {
				System.out.print("  j=" + j);
			}
		}
	}

}
