package Example14;
public class Example14{
void test() {
	final int num = 5;
	class Inner {
		void show() {
			System.out.println("�ֲ�����num��ֵΪ" + num);
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