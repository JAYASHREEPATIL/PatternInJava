import java.util.*;

public class Basic_Right_Triangle_Number_Pattern
{
	public static void main(String args[])
	{
		int n=4;
		int p=1;
		for(int i=n;i>=1;i--)
		{
			 
			for(int j=1;j<=i;j++)
			{
				System.out.print(p);
				p--;
			}
			System.out.println();
		}
	}
}