package code_class_file;

public class D30_overload_and_recursion {
	public static void main(String[] args) {
		m1();
		m4(2,4);
		m5();
		//我们打印输出的语句为System.out.println();
		//我们不如写一个方法重载来简化它
		p("jfshafo");
//		dosome();
	int N=9;
	int resultSum = sum(N);
	System.out.println(resultSum);
	}
	//以下两个方法构成重载(数量不同)
	public static void m1() {}
	public static void m1(int a) {}
	
	//以下两种方式构成重载（顺序不同）
	public static void m2(int a,double b) {}
	public static void m2(double a,int b) {}
	
	//以下两种方式构成方法重载（类型不同）
	public static void m3(int x) {}
	public static void m3(double x) {}
	
	//以下方法编译错误，不属于方法重载，属于方法重复
	public static void m4(int a,int b){}
	public static void m4(int b,int a){}
	
	//以下方法编译错误，不属于方法重载，属于方法错误
	void m5(){}
	public static void m5(){}
	
	public static void p(byte a) {
		System.out.print(a);
	}
	public static void p(short a) {
		System.out.print(a);
	}
	public static void p(char a) {
		System.out.print(a);
	}
	public static void p(int a) {
		System.out.print(a);
	}
	public static void p(long a) {
		System.out.print(a);
	}
	public static void p(float a) {
		System.out.print(a);
	}
	public static void p(double a) {
		System.out.print(a);
	}
	public static void p(boolean a) {
		System.out.print(a);
	}
	public static void p(String a) {
		System.out.print(a);
	}
	public static void p(String[] a) {
		System.out.print(a);
	}
	
	public static dosome() {
		p("dosome开始");
		dosome();
		p("dosome结束");				
	}
	
	public static int sum(int a) {
		if (a > 1) {
			return a+sum(a-1);
		}else {
		return 1;
		}
	}
}
