package java_learn_code.no_09_java_basic_syntax;

public class ContinueDemoTwo {

	public static void main(String[] args) {
		a:for(int i=1;i<7;i++) {
			for(int j=1;j<4;j++) {
				if(i==3) {
					continue a;
				}else {
					System.out.print("  j="+j);
				}
			}
			System.out.println(" i="+i);
		}

	}

}
