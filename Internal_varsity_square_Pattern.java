import java.util.*;

public class Internal_varsity_square_Pattern
{
	public static void main(String args[])
	{
		int n=4;
		int p=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if((i==0) ||(i==n-1))
				{
					System.out.print(p);
				}
				else if((j==0)||(j==n-2))
				{
					System.out.print(p);
				}
				else
				{
					System.out.print(i);
				}	
			}
			System.out.println();
		}
	}
}