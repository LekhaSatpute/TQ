package bhbjhi;

public class Pallindrome_number {

	public static void main(String[] args) {
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("Number "+a+" is a pallindrome number");
		}
		else
		{
			System.out.println("Number "+a+" is not a pallindrome number");
		}

	}

}
