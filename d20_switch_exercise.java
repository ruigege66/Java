public class d20_switch_exercise{
	public static void main(String[] args) {
		int a = 10+10;
		switch (a) {
		case 20 :
			println("我直接匹配成功了");
		case 12:
			println("我匹配失败了");
		case 20 : case 12 : case 15:
			println("我第二次匹配成功了");
		case 20 :
			println("我是为了避免case穿透的");
			break;
		case 20 :
			println("我如果打印出来了，代表上面的语句失败了");
		}
	}
}
