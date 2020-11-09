package Example03;
//表现函数分装的必要性
public class Example03 {
	public static void main(String[] args) {
		Division division = new Division();
		division.setDividend(10);
		division.setDivisor(0);
		int dividend = division.getDividend();
		int divisor = division.getDivisor();
		System.out.println(dividend / divisor);
	}
}
