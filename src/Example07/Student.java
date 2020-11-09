package Example07;

class Student {
	public void finalize() {
		System.out.println("垃圾对象回收");
	}
}
