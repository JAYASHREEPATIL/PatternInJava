import java.util.*;

public class Pyramid_Star_Pattern
{
	public static void main(String args[])
	{
		int n=6;
		int k=1;
		int s=n;
		for(int i=0;i<n;i++)
		{
			for(int x=1;x<s;x++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(k+i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
			k++;
			s--;
		}
	}
}