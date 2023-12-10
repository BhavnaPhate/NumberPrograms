package practice;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int num=1563;
		int temp=num;
		int sum=0;
		
		while(num!=0) {
			
			int rem= num%10;
			sum = sum + rem * rem * rem;
			num=num/10;	
		}
		
		if(sum==temp) {
			System.out.println(temp+" is Armstrong Number.");
		}
		else {
			System.out.println(temp+" is not a Armstrong Number.");
		}

	}

}
