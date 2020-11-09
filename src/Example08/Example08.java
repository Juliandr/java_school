package Example08;

public class Example08 {
	public static void main(String[] args) {
		/*Student s1 = new Student();
		s1.name = "张三";
		s1.className = "三年级二班";
		
		Student s2 = new Student();
		s2.name = "李四";
		s2.className = "三年级二班";
		
		Student s3 = new Student();
		s3.name = "王五";
		s3.className = "三年级二班";
		
		System.out.println("我的名字是" + s1.name + ",来自" + s1.className);
		System.out.println("我的名字是" + s2.name + ",来自" + s2.className);
		System.out.println("我的名字是" + s3.name + ",来自" + s3.className);*/
		Student.className = "三年纪二班";
		
		Student s1 = new Student();
		s1.name = "张三";
		Student s2 = new Student();
		s2.name = "李四";
		Student s3 = new Student();
		s3.name = "王五";

		System.out.println("我的名字是" + s1.name + ",来自" + s1.className);
		System.out.println("我的名字是" + s2.name + ",来自" + s2.className);
		System.out.println("我的名字是" + s3.name + ",来自" + s3.className);

	}
}
