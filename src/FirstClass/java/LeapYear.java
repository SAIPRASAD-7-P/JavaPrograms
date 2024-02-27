package FirstClass.java;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year=2023;
		
		if(year%400==0) {
			System.out.println("Leap Year");
		}else if(year%100==0) {
			System.out.println("Not a Leap Year");
		}else if(year%4==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a leap year");
		}
	}
}


/*

import java.util.Scanner;
public class LeapYear {
	   public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Leap year");
	      else
	         System.out.println("Not a leap year");
	   }
	}
*/
