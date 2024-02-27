package FirstClass.java;

public class Caroverrides extends Vehicle{
	
	public void drive() {
		System.out.println("Repairing a car");
	}
	
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Caroverrides c=new Caroverrides();
		
		v.drive();
		c.drive();
		
	}
}