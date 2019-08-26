public class d21_switch_exercise{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		System.out.print("请输入今天星期几：");
		
		String dayOfWeek = s.next();
		
		switch(dayOfWeek) {
		case "星期一" :
			System.out.println(1);
			break;
		case "星期二" :
			System.out.println(2);
			break;
		default :
			System.out.println("对不起您输入的数据非法");
			
		}
		char a = 'B';
		switch (a) {
		case 'B' :
			System.out.println("对了");
			break;
		default :
			System.out.println("错了");					
		}
		
		switch (a){
		case 66 :
			System.out.println("又对了");
			break;
		default :
			System.out.println("又错了");
		}
		//需求：
		double a1 = 95.5;
		int b1 = (int)(a1/10);
		switch(b1) {
			case 10 : case 9 :
				System.out.println("这是A级别");
				break;
			case 8 : case 7 : case 6 :
				System.out.println("这是B级别");
			default :
				System.out.println("这是C级别");
		}
	}
}
