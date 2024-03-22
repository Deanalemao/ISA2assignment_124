package Question5_124;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		double sum=0;
		
		System.out.println("Enter number :");
		
		num=scan.nextInt();
		int arm=num;
		int length = String.valueOf(num).length();
		
		while(num!=0) {
			int a=num%10;
			sum= Math.pow(a,length)+sum;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==arm) {
			System.out.println(arm+" is an Armstrong Number");
		}
		else {
			System.out.println(arm+" is not an Armstrong Number");
		}
	}

}
