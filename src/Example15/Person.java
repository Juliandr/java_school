package Example15;

public class Person {
	String name;
	void eat() {
		System.out.println("�Է�");
	}
	
	void sleep() {
		System.out.println("˯��");
	}
}
class Student extends Person {
	int sid;
}
class Teacher extends Person {
	int tid;
	void teach() {
		System.out.println("��ʦ�̿�");
	}
}
