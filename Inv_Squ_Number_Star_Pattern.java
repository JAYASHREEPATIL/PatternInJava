import java.util.*;
public class  Inv_Squ_Number_Star_Pattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=4;
		
		int pat1=4;
		int pat2=12;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i%2==0)
				{
					
					System.out.print(pat2--);
				}
				else
				{
					
					System.out.print(pat1--);
				}
				
			}
			pat1=part1+4;
			System.out.println();
		}
		pat1=pat1+7;
			pat2=pat2+7;
	}
}