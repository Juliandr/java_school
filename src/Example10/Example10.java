package Example10;

public class Example10 {
	static void staticMethod1() {
		System.out.println("this is for staticmethod1");
		//staticMethod2();这是访问静态方法
		//nonStaticMethod1();这是访问非静态方法
}
	
	static void staticMethod2() {
		System.out.println("this is for staticmethod2");
		
	}
	
	void nonStaticMethod1() {
		System.out.println("this is for nonstaticMethiod1");
		staticMethod1();
		nonStaticMethod2();
	}
	void nonStaticMethod2() {
		System.out.println("this is for nonstaticMethod2");
	}
	
	public static void main(String [] args) {
		//Example10.staticMethod1();
		Example10 e = new Example10();
		e.nonStaticMethod1();
		//非静态变量可以访问非静态变量也可以访问静态变量
	}
	//非静态变量只能通过对象或者对象的引用变量访问而静态变量可以通过类名直接访问
}
//静态方法可以访问静态方法