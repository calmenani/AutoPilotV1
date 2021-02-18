package javaConcepts;

interface IA {
	void show();
}

public class AnonymousClass {

	public static void main(String[] args) {
		IA ia=new IA() 
		{
			public void show() 
			{
				System.out.println("I am the best");
			}
		};
		ia.show();
	}

}
