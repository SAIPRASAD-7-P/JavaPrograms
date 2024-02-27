package FirstClass.java;

public class ThrowsExce{
	public static void main(String[] args) {
		try {
			
			int[] n= {1,2,3,4,5,6,6};
			for(int i=0;i<n.length;i++) {
				for(int j=i+1;j<n.length;j++) {
					if(n[i]==n[j]) {
						throw new Exception("Duplicate number found: "+n[i]);
						
					}
				}
			}
			System.out.println("No Duplicates found. List is valid");
		} catch(Exception e) {
			System.out.println("Error: "+ e.getMessage());
			
		}
	}
}
