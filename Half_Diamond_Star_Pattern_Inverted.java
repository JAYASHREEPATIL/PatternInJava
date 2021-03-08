import java.util.*;
public class Half_Diamond_Star_Pattern_Inverted
{
	public static void main(String args[])
	{
		int n=4;
		int s=4;
		for(int i=0;i<n;i++)
		{
			for(int x=s;x>0;x--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			s--;
		}
		if(s==0)
		{
			for(int i=n;i>=0;i--)
			{
				for(int x=0;x<s;x++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				s++;
				System.out.println();
			}
			
		}
	}
}