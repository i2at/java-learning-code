package java_learn_code.no_14_reference_data_type;

public class Test {
	public static void main(String[] args) {
		// 定义了一个Phone类型的变量p
		Phone p = new Phone();
		/*
		 * 通过p,使用Phone中的属性
		 */
		// 访问p中的brand品牌属性
		p.brand = "苹果6s";
		// 访问p中的color颜色属性
		p.color = "白色";
		// 访问p中的size尺寸大小属性
		p.size = 5.5;

		System.out.println("手机品牌为" + p.brand);
		System.out.println("手机颜色为" + p.color);
		System.out.println("手机尺寸大小为" + p.size);
	}
}
