package FirstClass.java;

public class PrimeorNot {

	public static void main(String[] args) {
		
	
		int n = 5;
        
        for(int i=2; i<=n/2;i++){
            if(n % i == 0){
                System.out.println("Not Prime");
                break;
        }else {
        	System.out.println("Prime number");
            }
        }
	}
}	