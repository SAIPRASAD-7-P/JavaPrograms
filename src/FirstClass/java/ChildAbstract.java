package FirstClass.java;

public class ChildAbstract extends EgAbstract{

	@Override
	void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Displaying Data");
	}
	
	public static void main(String[] args) {
		
		EgAbstract obj=new ChildAbstract();
		
		obj.display();
		
		obj.print();
	}

}
