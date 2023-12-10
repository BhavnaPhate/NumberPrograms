package practice;

public class BuzzNumRange {

	public static void main(String[] args) {
		int count=0;
		
		for(int i=1; i<100; i++) {
			
			int num=i;
			if(num%10==7 || num%7==0) {
				System.out.print(i+" ");
				count++;
			}
		}

	}

}
