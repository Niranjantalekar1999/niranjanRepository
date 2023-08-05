package javaConcept;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1,num2;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Numbers: ");
     
     //Take Inputs
     
     num1 = sc.nextDouble();
     num2 = sc.nextDouble();
     
     System.out.println("Enter the Operators (+,-,*,/): ");
     
     char op = sc.next().charAt(0);
     double o = 0;
     
     switch (op)
     {
     //case to add two num
     case'+':
    	 o = num1+num2;
    	 break;
    	 
    	//case to sub two num
     case'-':
    	 o = num1-num2;
    	 break;
    	 
    	//case to multiply two num
     case'*':
    	 o = num1*num2;
    	 break;
    	 
    	//case to divide two num
     case'/':
    	 o = num1/num2;
    	 break;
    	 default:
    		 System.out.println("Enter Wrong Input");
     }
     System.out.println("Final Result: ");
     System.out.println();
     
     //print the Final Result
     System.out.println(num1 +" "+ op + " "+ num2 + " = " + o);
     
	}

}
