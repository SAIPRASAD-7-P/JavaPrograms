package FirstClass.java;

public class MethodoverrideChild  extends MethodOverride{
	String color = "red";
	
	public static void main(String[] args) {
		
		MethodoverrideChild obj = new MethodoverrideChild();
		
		System.out.println(obj.color);
	}
}