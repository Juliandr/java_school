package Example10;

public class Example10 {
	static void staticMethod1() {
		System.out.println("this is for staticmethod1");
		//staticMethod2();���Ƿ��ʾ�̬����
		//nonStaticMethod1();���Ƿ��ʷǾ�̬����
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
		//�Ǿ�̬�������Է��ʷǾ�̬����Ҳ���Է��ʾ�̬����
	}
	//�Ǿ�̬����ֻ��ͨ��������߶�������ñ������ʶ���̬��������ͨ������ֱ�ӷ���
}
//��̬�������Է��ʾ�̬����