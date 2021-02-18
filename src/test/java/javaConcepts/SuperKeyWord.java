package javaConcepts;

class A{
	public A() {
		System.out.println("In A");
	}
	public A(int i) {
		System.out.println("In int A");
	}
}
class B extends A{
	
	public B() {
		super(6);
		System.out.println("In B");
	}
	public B(int i) {
		System.out.println("In int B");
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println();
		A aint=new A(5);
		System.out.println();
		B b=new B();
		System.out.println();
		B bint=new B(5);
	}

}
