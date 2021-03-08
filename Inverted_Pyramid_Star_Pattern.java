import java.util.*;
public class Inverted_Pyramid_Star_Pattern
{
	public static void main(String args[])
	{
		int n=6;
		int k=n+3;
		int s=0;
		int p=0;
		for(int i=0;i<n;i++)
		{
			for(int x=0;x<s;x++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(k-p);j++)
			{
				System.out.print("*");
			}
			p=p+2;
			s++;
			System.out.println();
		}
	}
}