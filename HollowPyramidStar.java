import java.util.*;
public class HollowPyramidStar
{
	public static void main(String args[])
	{
		int n=15;
		int c=1;
		int s=n-1;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<s;k++)
			{
				System.out.print(" ");
			}
			for(int x=0;x<c;x++)
			{
				if((x==0) || (x==(c-1)))
				{
					System.out.print("*");
				}
				else if(i==(n-1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			c=c+2;
			s--;
			System.out.println();
		}
	}
}
