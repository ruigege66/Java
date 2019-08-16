public class d17_assigining_operator_and_string_connect_operator{
	public static void main(String[] args) {
		int i = 23;
		i+=5;//这个式子等价于i=i+5;
		byte a = 5;
		//a = a +5;这个式子是编译不通过的，因为右边是int类型，而左边是byte类型下面才可以：
		a = (byte)(a + 5);
		System.out.println(a);
		byte b = 5;
		b += 10;//也是通过的，他等同于b = (byte)(b+10);而不是等同于b = b+10;
		System.out.println(b);

		System.out.println(10+20);
		System.out.println(10+20+30);
		System.out.println(10+20+"30");
		System.out.println(10+(20+"30"));//这两个例子说明运算顺序可以改变结果，这个例子说明都变成了字符串
		
	}
}
