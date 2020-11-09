package Example09;

public class Example09 {
	public static void main(String[] args) {
		Person lily = new Person();
		lily.name = "丽丽";
		Person lucy = new Person();
		lucy.name = "露西";
		System.out.println(lily.name + "的国籍是" + lily.nationality);
		System.out.println(lucy.name + "的国籍是" + lucy.nationality);
	}
}
