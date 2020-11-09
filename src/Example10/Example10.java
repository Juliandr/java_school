package Example10;

public class Example10 {
	static void staticMethod1() {
		System.out.println("this is for staticmethod1");
		staticMethod2();
	}
	
	static void staticMethod2() {
		System.out.println("this is for staticmethod2");
		
	}
	
	void nonStaticMethod1() {
		System.out.println("this is for nonstaticMethiod1");
	}
	void nonStaticMethod2() {
		System.out.println("this is for nonstaticMethod2");
	}
	
	public static void main(String [] args) {
		Example10.staticMethod1();
	}
}
//静态方法可以访问静态方法