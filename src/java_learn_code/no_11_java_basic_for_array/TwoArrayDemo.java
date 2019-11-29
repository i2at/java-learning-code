package java_learn_code.no_11_java_basic_for_array;

public class TwoArrayDemo {

	public static void main(String[] args) {
		//二维数组创建方式
		//方式一
		int[][] arr = new int[2][3];
		//方式二
		int[][] arr2 = new int[2][];
		arr2[0] = new int[5];
		arr2[1] = new int[1];
		//方式三
		int[][] arr3 = {{2,4,5},{1,2},{6,3,5,5}};
		//这种方式最简单，最常用。
		
		//二维数组的访问
		System.out.println(arr3[2][2]);
		//二维数组的遍历
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
