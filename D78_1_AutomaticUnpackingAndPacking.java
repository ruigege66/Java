public class D78_1_AutomaticUnpackingAndPacking{
	public static void main(String[] args){
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		//这里不会自动进行拆箱
		System.out.println(i1==i2);//false
		//比较两个Integer类型的数据是否相等，不能用“=="
		//Integer已经重写了Object中的equals方法
		System.out.println(i1.equals(i2));//true
		//重点：
		Integer i3 = 128;
		Integer i4 = 128;
		//上面的等同于：
		//Integer i3 = new Integer(128);
		//Integer i4 = new Integer(128);
		System.out.println(i3==i4);//false
		
		Integer i5 = 127;//这条语句直接在方法区的整形常量池中拿来，不会再堆内存中创建这个对象
		Integer i6 = 127;
		System.out.println(i5==i6);//true

		Integer i5 = -128;
		Integer i6 = -128;
		System.out.println(i5==i6);//true

		Integer i5 = -129;
		Integer i6 = -129;
		System.out.println(i5==i6);//false

		//如果数据是在-128到127之间，java中引入了”整形常量池“（可以类比字符串常量池）
		
		String s1 = "ab";
		String s2 = "ab";
		System.out.println(s1==s2);//true，原因就是字符串常量池
		
	}
}
		
