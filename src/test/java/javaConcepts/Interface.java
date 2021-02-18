package javaConcepts;

interface Writer {
	void write();
	default void show() {
		System.out.println("Default in interface");
	}
}

class Pen implements Writer {
	@Override
	public void write() {
		System.out.println("I am Pen");
	}
}

class Pencil implements Writer {
	@Override
	public void write() {
		System.out.println("I am Pencil");
	}
	public void show() {
		System.out.println("default method of interface in pencil");
	}
}

class Kit {
	public void doSomeThing(Writer p) {
		p.write();
	}
}

public class Interface {
	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomeThing(pc);
		p.show();
		pc.show();
	}
}
