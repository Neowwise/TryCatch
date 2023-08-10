package exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		try 
		{		
    		int a = Integer.parseInt(sc.nextLine());
			int b=Integer.parseInt(sc.nextLine());
			int c=a/b;	
			System.out.println(c);
		}
			catch(NumberFormatException nfe) {
    	    System.out.println("Rakam girmeliydiniz " + nfe.getMessage());  	   
       }		
	    	catch(ArithmeticException ae) {
			System.out.println("Bolucu 0 olamaz   " + ae.getMessage());	
		}
		
}
}
