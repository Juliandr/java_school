package Example15;

public class Person {
	String name;
	void eat() {
		System.out.println("³Ô·¹");
	}
	
	void sleep() {
		System.out.println("Ë¯¾õ");
	}
}
class Student extends Person {
	int sid;
}
class Teacher extends Person {
	int tid;
	void teach() {
		System.out.println("ÀÏÊ¦½Ì¿Î");
	}
}
