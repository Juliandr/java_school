package Example06;
//this �ؼ��ʷ��ʹ��췽��
class Student {
	public Student() {
		System.out.println("�޲εĹ��췽��");
	}
	public Student(String name) {
		this();
		System.out.println("һ�������Ĺ��췽��");
	}
	public Student(String name, int age) {
		this(name);
		System.out.println("���������Ĺ��췽��");
	}
}
//���췽��this���õ����ع��췽��������ڵ�һ�У����������ͨ������
