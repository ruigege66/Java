public class d15_{
	public static void main(String[] args){
		boolean i1 = true;
		if(i1){
			System.out.println("我被正确数出了");
		}else{
			System.out.println("我被错误输出了");
		}
		byte a = 10;//编译通过，因为没有超出byte的范围
		int b = 3;
		//byte c = a/b;//编译不通过，因为得到的值为int类型，必须强制转换才行,修改方式如下
		byte c = (byte)(a/b);
		
		int k =10;
		k ++;
		System.out.println(k);
		++ k;
		System.out.println(k);
		
		int a1 = 10;
		int a2 = ++a1;
		System.out.println(a1);
		System.out.println(a2);
	}
}
