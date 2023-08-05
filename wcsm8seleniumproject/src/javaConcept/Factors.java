package javaConcept;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter Number");
	       long num = sc.nextLong();
	       
	       for(long i=1;i<=num;i++)
	       {
	    	   if(num%i==0)
	    	   {
	    		   System.out.println(i);
	    	   }
	       }

	}

}
