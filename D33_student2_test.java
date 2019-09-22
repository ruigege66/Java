public class D33_student2_test {
	public static void main(String[] args) {
		//每个学生都有学号信息，但是每一个学生的学号都是不同的，所以要访问这个学号必须先创建对象，通过对象
		//去访问学号信息，学号信息不能直接通过“类”去访问，所以这种成员变量又被称为“实例变量”
		//对象又被称为实例，实例变量又被称为对象变量（对象级别的变量）
		//不创建对象，这个Number的内存空间是不存在的，只有创建了对象，这个number变量内存才会被创建
		D32_student s = new D32_student();
		System.out.println("jfahsf ");
		s.no = 154;
		s.address = "jafalj ";
		System.out.println(s.no);
		
		D32_student s2 = new D32_student();
		System.out.println(s2.no);
		//以下程序报错，因为no这个实例变量不能直接采用“类名”的方式访问
		//因为no是实例变量，对象级别的变量，变量存储在java对象的内部，必须先有对象，因为对象才能访问no这个实例变量
		//不能直接通过“类名”来访问
		//System.out.println(D32_student().no);
	}
}
class D32_student {
	//public static main(Sting[] args) {
	int no;//学号	
	String name;//姓名
	int age;//年龄
	boolean sex;//性别
	String address;//地址
	//方法是描述对象的动作信息，当前例子就不描述方法了，只描述信息属性
	//}	

}
