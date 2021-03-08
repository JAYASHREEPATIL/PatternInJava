import java.util.*;

public class Inverted_Hollow_Pyramid_Star_Pattern
{
	public static void main(String args[])
	{
		int n=4;
		int s=0;
		int k=3;
		for(int i=4;i>0;i--)
		{
			for(int x=0;x<s;x++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(i+k);j++)
			{
				if((i==4))
				{
					System.out.print("*");						
				}
				else if((j==0) || (j==(i+k)-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			k--;
			s++;
		}
	}
}