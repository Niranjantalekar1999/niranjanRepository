package javaConcept;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		long num = sc.nextLong();
		long sum=0;
		
		for(long i = num; i!=0; i=i/10)
		{
			long rem = i%10;
			sum=sum+rem;
		}
		System.out.println("sum of Digit :" +sum);
	}

}
