package javaConcepts;

public class MethodOverLoading {
	public static void main(String[] args) {
		Casio c = new Casio();
		c.add(4, 5);
		c.add(4, 5, 6);
		c.add(4.1, 5.6);
		Casio c1 = new Casio(4,5,"Add");
		System.out.println("num1-"+c1.num1+"num2"+c1.num2+"op-"+c1.Operation);
	}
}

class Casio {
	int num1;
	int num2;
	String Operation;
	public Casio() {
		num1=0;
		num2=0;
		Operation="Nothing";
	}
	public Casio(int i) {
		num1=i;
		num2=0;
		Operation="Nothing";
	}
	public Casio(int i,int j) {
		num1=i;
		num2=j;
		Operation="Nothing";
	}
	public Casio(int i,int j,String op) {
		num1=i;
		num2=j;
		Operation=op;
	}
	public void add(int i, int j) {
		System.out.println(i + j);
	}

	public void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public void add(double i, double j) {
		System.out.println(i + j);
	}
}
