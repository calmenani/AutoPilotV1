package javaConcepts;
/*Inner class
 * Member class
 * Static class
 * Anonymous class
 * */

class Outer {
	public static void show() {

	}

	static class Inner {
		public void display() {
			System.out.println("Display Inside inner class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.display();
	}

}
