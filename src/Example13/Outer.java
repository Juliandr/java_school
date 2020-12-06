package Example13;

class Outer {
	static class Inner {
		static String staticField = "静态内部类的静态变量";
		String nonStaticField = "静态内部的非静态变量";
		
		static void staticMethd() {
			System.out.println("静态内部类的静态方法");
		}
		void nonStaticMethod() {
			System.out.println("静态内部类的非静态方法");
		}
	}
}

