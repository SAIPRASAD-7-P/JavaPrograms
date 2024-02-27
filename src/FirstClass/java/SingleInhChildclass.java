package FirstClass.java;

public class SingleInhChildclass extends SingleInParentclass{

	String s2 = "Mumbai";
	
	public void print() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] args){
		SingleInhChildclass obj = new SingleInhChildclass();
		
		System.out.println(obj.s1);
		System.out.println(obj.s2);
		
		obj.display();
		obj.print();
	}	
}