package javaConcept;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
	    long num = sc.nextLong();
	    
	    long count=0;
	    
	    for(long i=1;i<=num;i++)
	    {
	    	if(num%i==0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println("The number is prime");
	    }
	    else
	    {
	    	System.out.println("The number not a prime");
	    }
	}

}
