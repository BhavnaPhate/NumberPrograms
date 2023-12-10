package practice;

public class Sum_UserDefinedMethod {
	
	public static int add(int n1, int n2)
	{
		int sum;
		sum=n1+n2;
		return sum;
	}

	public static void main(String[] args) {
		
		int a=7;
		int b=9;
		int c= add(a,b);
		System.out.println("Sum of "+a+ " and "+ b +" is: "+ c);

	}

}
