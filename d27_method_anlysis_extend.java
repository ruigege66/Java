public class d27_method_anlysis_extend{
	public static void main(String[] args) {
		//调用方法
		d27_.sum(10,50);
		//对于方法的修饰符列表之中有static关键字：“类名.”是可以省略不写的
		sum(20,41);
		//调用其他类的方法
		d27_2_.sum2();
		//省略d27_2_这个类型进行调用的时候（即：直接写sum2()），那么就会编译报错,只能在同一类中才能省略
		//sum2();
		
		sum3(10,55);//这里没有接收这个方法的返回值
		int af  = sum3(45,5458);
		System.out.println(af);
		
		sum4(23,23);
	}
	
	public static void sum(long a,long b) {
		System.out.println(a + "+" + b + "=" + (a+b));		
	}
	
	public static int sum3(int a, int b) {
		System.out.println("优秀");
		return a + b;
	}
	
	public static int sum4(int a,int b) {
		if (a<23){
			return 2;
		}else {
			return 3;
		}
	}
	/*
	 *还可以写为
	*	public static int sum4(int a,int b) {
    *		return a<23 ? 2:3;
    *	}
          * 或者
    *	public static int sum4(int a,int b) {
    *		if (a<23){
    *			return 2;
    *		}
    *		return 3;
    *	}
    return 3;
	 */
}

class d27_2_{
	public static void sum2() {
		System.out.println("我是用来测试的");
	}
	public static void sum(long a,long b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
}
