public class d26_method_format_exercise{
	//类体中不能直接写java语句，除了声明变量之外
	public static void main(String[] args) {
		//main：是主方法名。
		//（string[] args)表示形式参数列表，其中String[]是一种引用数据类型，args是一个局部变量的变量名
		//主方法就需要这样固定编写，这是程序的入口（sun公司就是这样规定的，必须这样写）
		//主方法是JVM负责调用的，是一个入口位置
		d26_.addTwoInteger(4156, 51);
		
	}
	
	public static void addTwoInteger(int a,int b) {
		//自定义方法，不是程序的入口
		//修饰符列表：public static
		System.out.println(a + "+" + b + "=" + (a+b));
		
	}
}
