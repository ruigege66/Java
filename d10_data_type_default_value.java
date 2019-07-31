public class d10
{	
	static int i = 100;
	static int a;//这是成员变量，没有赋值，编译不会报错，系统会自动给a赋值
	public static void main(String[] args) 
	{
		//int b;  //这是局部变量，没有赋值如果直接编译会报错
		//System.out.println(b);
		System.out.println(i);
		System.out.println(a);
	}

}
