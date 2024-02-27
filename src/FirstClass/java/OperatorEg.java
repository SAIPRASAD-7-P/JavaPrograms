package FirstClass.java;

public class OperatorEg {
	int a=10;
	double b=9.8;
	
	public void add() {
		double c;
		c=a+b;
		System.out.println(c);
	}
	public void sub() {
		double d;
		d=a-b;
		System.out.println(d);
	}
	public void mul() {
		double e;
		e=a*b;
		System.out.println(e);
	}
	public void div() {
		double f;
		f=a/b;
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		
		OperatorEg oe = new OperatorEg();
		oe.add();
		oe.sub();
		oe.mul();
		oe.div();
		
	}

}
