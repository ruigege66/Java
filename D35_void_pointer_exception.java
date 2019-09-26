public class D35_void_pointer_exception{
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.age);
		s = null;
		//以上程序是可以编译通过的，因为它符合语法，但是运行时会出现空指针异常:java.lang.NullPointerException
		//空引用访问“实例”相关的数据一定会出现空指针异常
		System.out.println(s.age);
	}
}
