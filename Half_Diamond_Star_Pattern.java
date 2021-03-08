import java.util.*;
public class Half_Diamond_Star_Pattern
{
	public static void main(String args[])
	{
		int n=4;
		int i=0;
		for(i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		if(i==n)
		{
			for(i=n;i>=0;i--)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println(" ");
				
			}
		}
	}
}