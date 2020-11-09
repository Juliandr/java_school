package Example07;

public class Example07 {

	public static void main(String[] args) {
		new Student();
		new Student();
		System.gc();
		for (int i=0;i<100000000;i++) {
			//延长程序结束时间
		}

	}

}
