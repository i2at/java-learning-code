package java_learn_code.no_15_java_for_collection;

import java.util.ArrayList;

public class ArrayListDemo04 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(8);
		//指定索引添加指定元素
		list.add(1, 6);
		//修改指定索引元素值
		list.set(0, 9);
		//删除指定索引上的元素
		list.remove(1);
		//清空全部元素
		list.clear();
		//遍历所有元素
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
