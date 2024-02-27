package FirstClass.java;

//import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		String str="madam", revstr="";     //madam, radar, malayalam;
		int strLength=str.length();
		
		for(int i=(strLength-1); i>=0;--i) {
			revstr=revstr+str.charAt(i);
		}
		if(str.toLowerCase().equals(revstr.toLowerCase())){
			
			System.out.println("String is Palindrome: "+ str);
		}else {
			System.out.println("String is Not a Palindrome: "+ str);
		}
	}
}
		
		
			
		
/*	
		int r,sum=0,temp;
		int n=151; //151,171,
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}
	}

}

*/


