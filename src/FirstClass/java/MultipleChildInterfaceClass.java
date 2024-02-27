package FirstClass.java;

public class MultipleChildInterfaceClass implements Interface1, Interface2{
	
	public void writestatus() {
		
		System.out.println("Writing");
		
	}
    public void readstatus() {
		
		System.out.println("Reading");
		
	}
	public static void main(String[] args) {
		
		MultipleChildInterfaceClass obj = new MultipleChildInterfaceClass();
		
		obj.readstatus();
		
		obj.writestatus();

	}
}