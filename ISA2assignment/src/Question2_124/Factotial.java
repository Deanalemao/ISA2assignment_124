package Question2_124;

import java.util.Scanner;

public class Factotial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		int num;
		int fact=1;
		System.out.println("Enter a number:");
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("Factorial of "+num+" is:"+fact);
		
	}

}
