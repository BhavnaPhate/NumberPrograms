package practice;

import java.util.Scanner;

public class BuzzNum {

	public static void main(String[] args) {
		// Number which is divisible by 7 or the number which ends with 7 is Buzz number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		if(num%10==7 || num%7==0) {
			System.out.println("Buzz Number");
		}
		else {
			System.out.println("Not a buzz number");
		}

	}

}
