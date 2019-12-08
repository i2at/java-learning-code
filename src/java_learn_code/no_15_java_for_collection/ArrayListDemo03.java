package java_learn_code.no_15_java_for_collection;

import java.util.ArrayList;

public class ArrayListDemo03 {

	public static void main(String[] args) {
		// 创建ArrayList集合
		ArrayList<String> list = new ArrayList<String>();
		// 向集合中添加元素
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");

		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
