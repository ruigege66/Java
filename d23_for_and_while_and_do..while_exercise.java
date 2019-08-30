public class d23_{
	public static void main(String[] args) {
		for(int i = 1;i<=9;i++) {
			for(int j = 1;j<=i;j++) {
				String a = j+"*"+i+"="+(j*i)+" ";
				System.out.print(a);
				
			}
			System.out.print("\n");
		}
		
		
		while(true) {//这里面编译是不通过的，因为编译的时候，编译器检测到这是死循环，将会报错
			System.out.println("这是死循环");
		}
		int a = 1;
		int b = 2;
		while(a<b) {//这里的死循环就会编译通过，因为编译器没有检测到这是死循环，括号里面的语句是运算后才知道这是
			//死循环的，我们知道在编译阶段，编译器不会计算结果的、
			System.out.println("这也是一个死循环");
		}
		
		int c = 10;
		while(c > 0) {
			System.out.print(c-- + "  ");//这里先打印再进行计算
		}
		int d = 10;
		System.out.println("");
		while(d > 0) {
			System.out.print(--d + "  ");//这里先计算再进行打印
		}
	}
}
