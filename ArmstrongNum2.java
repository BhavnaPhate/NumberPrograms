package practice;

public class ArmstrongNum2 {

	public static void main(String[] args) {
		for(int i=10; i<10000; i++) {
		int num=i;
		int temp=num;
		int sum=0;
		int count=0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
			
		}
		
		while(temp!=0) {
			int rem= temp%10;
			sum=(int)(sum+Math.pow(rem, count));
			temp=temp/10;
			
		}
		
		if(sum==i) {
			
			System.out.println(sum);
			
		}

	}
	}
}
