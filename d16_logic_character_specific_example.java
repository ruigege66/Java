public class d16_{
	public static void main(String[] args) {
		int a = 10;
		System.out.print(a++);//这里会打印出10，因为他们内部这个print函数有参数相当于参数x=a++
		System.out.println(a++);//这里会打印出11，原理跟上一个一样，我们上一个打印出10，但是后面会让a累加1
		int x = 10;
		int y = 8;
		System.out.println(x < y & ++x < y);
		System.out.println(x);
		
		System.out.println(x < y && ++x < y);
		System.out.println(x);
		
	}
}程序已经计算出来它是假的，因此后面是什么已经无所谓了，所以&&后面的语句就不在执行了
