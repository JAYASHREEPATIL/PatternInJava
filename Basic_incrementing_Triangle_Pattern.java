import java.util.*;
public class Basic_incrementing_Triangle_Pattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=(n-1)*2;
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(k);
			}
			k--;
			System.out.println();
		}
	}
}
