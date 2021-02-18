package javaConcepts;

class S {
	int i;
	public void show() {
		System.out.println("In A");
	}
}
class C extends S {
	int i;
	@Override
	public void show() {
		i = 5;
		super.i = 6;
		super.show();
		System.out.println("In B");
	}
}
class D extends S {
	@Override
	public void show() {
		System.out.println("In D");
	}
}
public class MathodOverriding {

	public static void main(String[] args) {
		C c = new C();//Run time polymorphism
		c.show();
		S s=new D();
		s.show();//Dynamic method dispatch
	}

}
