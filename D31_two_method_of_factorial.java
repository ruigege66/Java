package code_class_file;

public class D31_two_method_of_factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial_recursion(5));
	}
	//普通循环结构实现阶乘
	public static int factorial(int n) {
		int i = 1;
		int result = 1;
		for(;i<=n;i++) {
			result *= i;
		}
		return result;
	}
	//递归方法实现阶乘
	public static int factorial_recursion(int n) {
		if (n == 1) return 1;
		else return (n * factorial_recursion(n-1));
	};

}
