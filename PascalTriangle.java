import java.util.*;

public class PascalTriangle
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		output(n);
	}
	public static void output(int n)
	{
		int s=n-1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<s;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(nCr(i,j)+" ");
			}
			System.out.println();
			s--;
		}
	}
	public static int factorial(int n)
	{
		int f;
		for(f=1;n>1;n--)
		{
			f *=n;
		}
		return f;
	}
	public static int nCr(int n,int r)
	{
		return factorial(n)/(factorial(n-r)*factorial(r));
	}
}