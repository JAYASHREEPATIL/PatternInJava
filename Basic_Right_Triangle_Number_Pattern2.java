import java.util.*;
import java.lang.*;
import java.io.*;
public class Basic_Right_Triangle_Number_Pattern2
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n,i,j,a;
		System.out.print("Enter N value:");
		n=in.nextInt();
		for(i=n;i>=1;i--)
		{
			if(i%2==0)
			{
				a=(i*(i+1))/2;

				for(j=1;j<=i;j++)
				{
					System.out.print(a--);
				}
			}
			else
			{
				a=(i*(i-1))/2+1;
				for(j=1;j<=i;j++)
				{
					System.out.print(a++);
				}
			}
			System.out.println();
		}
	}
}