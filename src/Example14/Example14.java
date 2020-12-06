package Example14;
public class Example14{
void test() {
	final int num = 5;
	class Inner {
		void show() {
			System.out.println("局部变量num的值为" + num);
		};
	}
	Inner inner = new Inner();
	inner.show();
}

	public static void main(String[] args) {
		Example14 e = new Example14();
		e.test();
	}
}