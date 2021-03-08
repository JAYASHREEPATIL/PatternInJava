import java.util.*;
public class Inc_Inv_Number_StarPattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int end=n*n;
		int start=0;
		int k=n-1;
		for(int i=0;i<n;i++)
		{
			start=end-k;
			for(int j=0;j<n-1;j++)
			{
				System.out.print((start++)+"*");
			}
			System.out.print(start++);
			end--;
			k=k+(n-1);
			System.out.println();
		}
	}
}