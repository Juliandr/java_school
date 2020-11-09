package Example03;

public class Division {
	private int dividend = -1;
	private int divisor = 1;
	public void setDividend(int mDividend) {
		dividend = mDividend;
	}
	public int getDividend() {
		return dividend;
	}
	public void setDivisor(int mDivisor) {
		if (mDivisor == 0) {
			System.out.println("The divisor can't be Zero");
		}
		else {
			divisor = mDivisor;
		}
	}
	public int getDivisor() {
		return divisor;
	}
}
