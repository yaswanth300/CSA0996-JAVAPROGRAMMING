import java.util.Scanner;
public class pattern121
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter number of rows:");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=1;
			for(int s=1;s<=n-i;s++)
			{	
				System.out.print(" ");
			}	
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a*(i-j)/j;
			}
			System.out.println();
		}
	}
}
