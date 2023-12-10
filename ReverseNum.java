package practice;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num= 98765;
		
		while(num!=0) {
			
		int rem= num%10;
		num=num/10;
		
		System.out.print(rem);
			
		}
	}

}
