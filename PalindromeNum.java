package practice;

public class PalindromeNum {

	public static void main(String[] args) {
		int num=121;
		int sum=0;
		int temp=num;
		
		while(num!=0) {
			int rem= num%10;
			sum=sum*10+rem;
			num/=10;
		}
		System.out.println(sum);
		
		if(sum==temp) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	
	

}
