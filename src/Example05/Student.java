package Example05;
//掌握类中定义重载的构造方法
class Student {
	public Student() {
		System.out.println("无参的构造方法");
	}
	public Student(String name) {
		System.out.println("一个参数的构造方法");
	}
	public Student(String name, int age) {
		System.out.println("两个参数的构造方法");
	}
}
