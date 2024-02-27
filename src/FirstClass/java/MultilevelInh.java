package FirstClass.java;

public class MultilevelInh {
	
	
	class ClassA {
	    public void displayA() {
	        System.out.println("This is ClassA");
	    }
	}

	class ClassB extends ClassA {
	    public void displayB() {
	        System.out.println("This is ClassB");
	    }
	}

	class ClassC extends ClassB {
	    public void displayC() {
	        System.out.println("This is ClassC");
	    }
	}
	    
	public static void main(String[] args) {
		ClassC obj = new ClassC();
	    obj.displayA(); // Accessing method of ClassA
	    obj.displayB();
	    obj.displayC();
	    }
	}

	
	
	

}
