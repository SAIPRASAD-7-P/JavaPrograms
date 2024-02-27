package FirstClass.java;

public class MethodOverloadingEg {
	
	/*
	public void add(int a, int b) {
		int c=a+b;
		
		System.out.println(c);
	}
	
	public void add(int a,int b,int c) {
		int d = a + b+ c;
		System.out.println(d);
	}
	public void add(int a,int b,int c, int d){
		int e = a + b+ c +d;
		System.out.println(e);
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		
		obj.add(6,7);
		obj.add(6,7,8);
		obj.add(6,7,8,9);
	}
}

*/
	
	
	
	/*
	public void add(int a,float b) {
		float c =a + b;
		
		System.out.println(c);
	}
	
	public void add(int a,double b,double c) {
		double d = a + b + c;
		System.out.println(d);
	}
	public void add(int a,int b,double c,double d){
		double e = a + b + c + d;
		System.out.println(e);
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		
		obj.add(6,7);
		obj.add(6,7.5,8.5);
		obj.add(6,7,8.5,9.5);
		
	}
}

*/

	
	
	/*
	public void add(int a,float b) {
		float c =a + b;
		
		System.out.println(c);
	}
	
	public void add(int a,double b,long c) {
		double d = a + b + c;
		
		System.out.println(d);
	}
	public void add(int a,int b,long c,long d){
		double e = a + b + c + d;
		
		System.out.println(e);
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		
		obj.add(6,7);
		obj.add(6,7.5,850);
		obj.add(6,7,850,770);
	}
}

*/
	
	
	
	public void add(int a,int b) {
		int c =a + b;
		
		System.out.println(c);
	}
	
	public void add(double a,double b,double c) {
		double d = a + b + c;
		System.out.println(d);
	}
	
	public void add(long a,long b,long c,long d){
		long e = a + b + c + d;
		
		System.out.println(e);
		
	}
	
	public static void main(String[] args) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		
		obj.add(6,7);
		obj.add(6.5,7.5,8.5);
		obj.add(650,670,650,770);
	}
}




