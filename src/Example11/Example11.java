package Example11;

public class Example11 {
	
	static {
		System.out.println("��̬�����");
	}
	//��̬�����ֻ���յ�һ��ʹ���б����أ���ֻ����һ��
	{
		System.out.println("��������");
	}
	
	public Example11() {
		System.out.println("���췽��");
	}
	void localBlock() {
		System.out.println("�ֲ������");
	}

	public static void main(String[] args) {
		Example11 e1 = new Example11();
		e1.localBlock();
		System.out.println("--------------");
		Example11 e2 = new Example11();
		e2.localBlock();
	}

}
