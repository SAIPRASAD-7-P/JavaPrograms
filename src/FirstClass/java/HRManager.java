package FirstClass.java;
// HRManager subclass of Employee
	class HRManager extends Employee {
	    // Overriding the work method
		
	    public void work() {
	        System.out.println("HR Manager is managing employees");
	    }

	    // New method to add an employee
	    public void addEmployee() {
	        System.out.println("HR Manager is adding a new employee");
	    }
	    public static void main(String[] args) {
	        // Creating an HRManager object
	        HRManager HR = new HRManager();
	        HR.work(); // Calling overridden work method
	        HR.addEmployee(); // Calling the new method
	    }
	}
