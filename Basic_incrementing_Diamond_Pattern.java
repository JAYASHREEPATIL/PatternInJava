import java.util.*;
public class Basic_incrementing_Diamond_Pattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		System.out.print("Enter start: ");
		int k=in.nextInt();
		int i=0;
		for(i=0;i<n;i++)
		{
				for(int j=0;j<=i;j++)
				{
					System.out.print(k);
				}
				k++;
				System.out.println();
		}
		k=k-2;
			for(i=(n-2);i>=0;i--)
			{
					for(int j=0;j<=i;j++)
					{
						System.out.print(k);
					}
					k--;
					System.out.println();
			}
		
	}
}