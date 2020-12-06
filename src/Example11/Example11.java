package Example11;

public class Example11 {
	
	static {
		System.out.println("静态代码块");
	}
	//静态代码块只在勒第一次使用中被加载，且只加载一次
	{
		System.out.println("构造代码块");
	}
	
	public Example11() {
		System.out.println("构造方法");
	}
	void localBlock() {
		System.out.println("局部代码块");
	}

	public static void main(String[] args) {
		Example11 e1 = new Example11();
		e1.localBlock();
		System.out.println("--------------");
		Example11 e2 = new Example11();
		e2.localBlock();
	}

}
