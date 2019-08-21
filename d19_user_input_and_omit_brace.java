public class d19_{
	public static void main(String[] args) {
		double a = 20.2;
		if(a>100 || a<0) {
			System.out.println("开始成绩不合法");
		}else if(a>90){
			System.out.println("成绩优秀");
		}else if(a>60) {
			System.out.println("成绩合格");
		}else {
			System.out.println("成绩不合格");
		}
		
		//第一步：创建键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		//第二步：调用Scanner对象的nextInt()方法开始接收用户的键盘输入
		//程序执行到这里就会停下来，等待用户输入
		//接收数字，以整数型int的形式来接收
		System.out.print("请输入您的年龄:");
		int num = s.nextInt();//停下来等待用户输入。输入之后自动接收，赋值给age变量
		System.out.println("age = " + num);
		boolean a2 = true;
		if(a2) System.out.println("OK"); else System.out.println("not");//编译通过，if或者else后面只有一行java语句，因此可以通过
		
		if(a2) System.out.println("OK"); System.out.println("我是多余的一行");else System.out.println("not");
		//这样写就会编译报错提示else有语法错误，相当于把if后面第一条语句用大括号括起来了，第二条语句与if无关，即使缩进了也没用，因此会输出：“我是多余的一行”
		
		
	}
}
