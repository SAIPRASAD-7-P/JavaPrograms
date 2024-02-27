package FirstClass.java;

public class ifelseladder{
	/*public static void main(String[] args) {
		int n=5;
		
	    if(n>0) {
	    	System.out.println("Positive number");	
	    }else if(n<0) {
	    	System.out.println("Negative number");
	    }else {
	    	System.out.println("number is equal to zero");
	    }
    }
}
*/
	
	public static void main(String[] args) {
		
		int marks=65;
		
		if(marks<50) {
			System.out.println("Fail");
		}else if(marks >=50 && marks <60) {
			System.out.println("D Grade");
		} else if(marks>=60 && marks<70) {
			System.out.println("C Grade");
		}else if(marks>=70 && marks<80) {
			System.out.println("B Grade");
		} else {
			System.out.println("Invalid");
        }
	}
}
	