package javaConcepts;

public class Constructor {
//Member method
//Same name as class name
//It will never return any value
//Used to allocate memory
//On object creation constuctor will be called
public static void main(String args[]) {
	Calc c1=new Calc();
	Calc c2=new Calc();
	System.out.println(c1.num1);
	System.out.println(c2.num1);
}

	
	
}
class Calc
{
int num1;
int num2;
int result;
public Calc() {
	num1=5;
	num2=5;
	System.out.println("In constructor");
}
public Calc(int n) {
	num1=n;
	num2=n;
	System.out.println("In constructor");
}

}