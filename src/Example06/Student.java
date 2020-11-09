package Example06;
//this 关键词访问构造方法
class Student {
	public Student() {
		System.out.println("无参的构造方法");
	}
	public Student(String name) {
		this();
		System.out.println("一个参数的构造方法");
	}
	public Student(String name, int age) {
		this(name);
		System.out.println("两个参数的构造方法");
	}
}
//构造方法this调用的重载构造方法必须放在第一行，否则程序不能通过编译
