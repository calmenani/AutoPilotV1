package javaConcepts;

class Cal {
	public void add(int...n) {
		int sum = 0;
		for (int i : n)
			sum = sum + i;
		System.out.println(sum);
	}
}
public class Varargs {
	public static void main(String[] args) {
		Cal c = new Cal();
		c.add(12, 46, 87, 52, 6, 5, 4, 23, 64, 33, 3);
	}

}
