package hitesh_package;

abstract class Abs {
	static void meth() {
		System.out.println("Hello 1");

	}

	void meth(int a) {
		System.out.println("hello " + a);
	}

	abstract void meth(int a, int b);
}

interface In {
	void meth(double a);

	public static final int c = 10;
}

class Child extends Abs implements In {

	@Override
	public void meth(double a) {
		// TODO Auto-generated method stub
		System.out.println("hello in child");
	}

	@Override
	void meth(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("hello in child");
	}

}

public class Access {
	public String pub = "Public";
	public String pro = "Protected";

	public static void main(String[] args) {
		System.out.println("Addition of SYSO");
		System.out.println("Hello");
		Access access = new Access();
		Child child = new Child();
		child.meth();
	}
}
