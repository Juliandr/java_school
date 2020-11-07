package Example02;


class Student {
	private String name = "张三";
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
			System.out.println("设置的年龄不合法");
		}else{
			age = a;
			}
		}
		void speak() {
			System.out.println("我的名字是" + name + "，今年" + age + "岁");
		}
}

