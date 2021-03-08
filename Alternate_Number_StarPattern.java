import java.util.*;
public class Alternate_Number_StarPattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int pat1=1;
		int pat2=(n*2)+1;
		
		for(int i=0;i<n;i++)
		{
			
				for(int j=0;j<n-1;j++)
				{
					if(i%2==0)
					{
						System.out.print((pat1++)+"*");
					}
					else
					{
						System.out.print((pat2++)+"*");
					}
				}
				if(i%2==0)
					{
						System.out.print((pat1++));
					}
					else
					{
						System.out.print((pat2++));
					}
			System.out.println();
		}
	}
}