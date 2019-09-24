public class D34_husband_and_wife{
	public static void main(String[] args){
		Student abc1 = new Student();
		abc1.no = 45;
		System.out.println(abc1.age);
		
		
		Husband huangxiaoming = new Husband();
		Wife baby = new Wife();
		huangxiaoming.name = "huangxiaoming";
		baby.name = "baby";
		//上面的例子其实将两个人割裂开来，没有建立关系
		//下面对她们进行建立关系
		huangxiaoming.w = baby;
		baby.h = huangxiaoming;
		

	}
}
class Wife {
	String name;
	Husband h;
}
class Husband {
	String name;
	Wife w;
}
