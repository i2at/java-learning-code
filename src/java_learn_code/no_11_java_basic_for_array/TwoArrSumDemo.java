package java_learn_code.no_11_java_basic_for_array;

public class TwoArrSumDemo {

	public static void main(String[] args) {
		int[][] sort = {{11,12},{21,22,23},{31,32,33,34}};
		int allSum = 0;
		int sum = 0;
		
		for(int i=0;i<sort.length;i++) {
			for(int j=0;j<sort[i].length;j++) {
				allSum+=sort[i][j];
			}
			sum+=sort[i][0];
		}
		System.out.println(sum);
		System.out.println(allSum);
	}

}
