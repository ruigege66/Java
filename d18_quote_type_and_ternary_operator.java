public class d18_quote_type_and_ternary_operator{
	public static void main(String[] args) {
		System.out.println("youxiu");
		System.out.println("hello");
		String s = "abc";
		//String aa = 10;编译不通过，不满足数据类型定义
		boolean a = false;
		boolean a1 = true;
		String b = a ? "youxiu":"niubi";
		System.out.println(b);
		if (a1) System.out.println("我省略了大括号");
		
	}
}
