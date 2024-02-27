package FirstClass.java;

public class ChildInterfaceClass implements Int1{

	public void read() {
		
		System.out.println("Reading");
	}

	public void write() {
		
		System.out.println("Writing");
		
	}

	public static void main(String[] args) {
		
		ChildInterfaceClass obj = new ChildInterfaceClass();
		
		obj.read();
		
		obj.write();
		
		System.out.println(obj.s1);

	}
}
