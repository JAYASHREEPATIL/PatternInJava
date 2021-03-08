import java.util.*;
public class Hollow_Pyramid_Star_Pattern
{
	public static void main(String args[])
	{
		int n=11;
		int k=0;
		int s=n;
		
		for(int i=0;i<n;i++)
		{
			for(int x=1;x<s;x++)
				{
					System.out.print(" ");
				}
			if(i==0)
			{
				System.out.print("*");
			}
			else if(i==(n-1))
			{
				for(int j=0;j<=(n+k);j++)
				{
					System.out.print("*");
				}
			}
			else  
			{
				System.out.print("*");
				for(int j=0;j<(i+k);j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				k++;
			}
			s--;
			System.out.println();
		}
	}
}