package Example02;


class Student {
	private String name = "����";
	private int age = 20;
	public String getName() {
		return name;
	}
	public void setName(String n) {
			name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		if(a < 0){
			System.out.println("���õ����䲻�Ϸ�");
		}else{
			age = a;
			}
		}
		void speak() {
			System.out.println("�ҵ�������" + name + "������" + age + "��");
		}
}

