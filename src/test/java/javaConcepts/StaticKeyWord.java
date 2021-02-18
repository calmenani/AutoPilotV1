package javaConcepts;

class Employee {
	int eid;
	int salary;
	static String ceo;

	static {
		ceo = "Alan";
	}

	public Employee() {
		eid = 101;
		salary = 5000;
	}

	void show() {
		System.out.println("  eid  " + eid + "  salary  " + salary + "  ceo  " + ceo);
	}
}

public class StaticKeyWord {

	public static void main(String[] args) {
		Employee prasanna = new Employee();
		Employee madhu = new Employee();
		Employee.ceo = "Jeff";
		prasanna.show();
		madhu.show();
	}
}
