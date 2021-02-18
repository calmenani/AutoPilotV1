package javaConcepts;

class Calculator{
	public int add(int i, int j) {
		return i+j;
	}
}
class CalculatorAdv extends Calculator{
	public int sub(int i, int j) {
		return i-j;
	}
}
class CalculatorVeryAdv extends CalculatorAdv{
	public int mul(int i, int j) {
		return i*j;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		CalculatorVeryAdv cva=new CalculatorVeryAdv();
		System.out.println(cva.add(1, 2));
		System.out.println(cva.sub(6, 4));
		System.out.println(cva.mul(2, 3));
	}

}
