package javaConcepts;

public class ThisKeyWord {
	static int num1;
	static int num2;
	int result;

	public ThisKeyWord(int num1, int num2) {
		this.num1 = num1;
		this.num1 = num2;
	}

	public static void main(String args[]) {
		ThisKeyWord t = new ThisKeyWord(4, 5);
		System.out.println(num1 + num2);

	}
}
