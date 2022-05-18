package bhbjhi;

public class Armstrong_number {

	public static void main(String[] args) {
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("The no "+a+" is armstrong number");
		}
		else
		{
			System.out.println("The no "+a+" is not armstrong number");
		}

	}

}
