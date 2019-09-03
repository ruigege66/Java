public class d25_method_example{
	public static void main(String[] args) {
		//需求1：请编写程序计算10和20的和，并将结果输出
		int a = 10;
		int b = 20;
		System.out.print(a + "+" + b  + "=" +(a+b));
		System.out.print("\n");
		//需求2：请编写程序计算22和55的和，并将计算结果输出
		int a1 = 22;
		int b1 = 55;
		System.out.print(a1 + "+" + b1  + "=" +(a1+b1));
		
		d25_method_example.sumInt(52, 464);
		/*
		 * 以下直接使用方法这种机制
		 */	
	}
	//单独定义一个方法来计算上面的两个数字之和,代码得到复用
	public static void sumInt(int a ,int b) {
		int c = a+b;
		System.out.print("\n");
		System.out.print(a + "+" + b + "=" + c);
	
	}
}
