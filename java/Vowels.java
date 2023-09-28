import java.util.*;
public class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any string:");
		s=sc.nextLine();
		for(i=0;i<s.length();i++)
		{
			a=s.charAt(i);
			if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
			{
				cnt+=1;
			}
		}
		System.out.print("number of vowels:"+cnt);
	}
}

