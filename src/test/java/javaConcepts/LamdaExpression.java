package javaConcepts;

interface IB {
	void show();
}

public class LamdaExpression {

	public static void main(String[] args) {
		IB ib = () -> System.out.println("I am the best");
		ib.show();
	}
}
