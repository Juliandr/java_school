package Example08;

public class Example08 {
	public static void main(String[] args) {
		/*Student s1 = new Student();
		s1.name = "����";
		s1.className = "���꼶����";
		
		Student s2 = new Student();
		s2.name = "����";
		s2.className = "���꼶����";
		
		Student s3 = new Student();
		s3.name = "����";
		s3.className = "���꼶����";
		
		System.out.println("�ҵ�������" + s1.name + ",����" + s1.className);
		System.out.println("�ҵ�������" + s2.name + ",����" + s2.className);
		System.out.println("�ҵ�������" + s3.name + ",����" + s3.className);*/
		Student.className = "����Ͷ���";
		
		Student s1 = new Student();
		s1.name = "����";
		Student s2 = new Student();
		s2.name = "����";
		Student s3 = new Student();
		s3.name = "����";

		System.out.println("�ҵ�������" + s1.name + ",����" + s1.className);
		System.out.println("�ҵ�������" + s2.name + ",����" + s2.className);
		System.out.println("�ҵ�������" + s3.name + ",����" + s3.className);

	}
}
