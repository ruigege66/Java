public class d20_switch_exercise{
	public static void main(String[] args) {
		int a = 10+10;
		switch (a) {
			case 20 :
				System.out.println("我直接匹配成功了");
				break;//匹配成功了，因为有break后面不会执行了
			case 12:
				System.out.println("我匹配失败了");
				break;
			default :
				System.out.println("我是剩余的语句");
		}
		switch (a) {
			case 20 : case 12 : case 15:
				System.out.println("我是测试多条件的");//这里匹配只要满足一个就行，就能执行下去
				break;
			default :
				System.out.println("我是剩余的语句");
		}
		switch (a) {
				case 20 :
					System.out.println("我直接匹配成功了");
				case 12:
					System.out.println("我匹配失败了");
				case 18 :
					System.out.println("我匹配失败了");
				case 29 :
					System.out.println("我是为了测试case穿透的");
					break;//因为第一个匹配成功了，而且后面没有break语句，会一直执行下去直到这里的break
				default :
					System.out.println("我是剩余的语句");
		}
	}
}
