import java.util.*;
public class Alter_Sequen_Number_Star_Pattern
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int rows=1;rows<=n;rows++)
		{
			for(int cols=1;cols<=n-1;cols++)
			{
				count++;
				if(cols==n-1)
				{
					System.out.print(count);
				}
				else
				{
					System.out.print(count+"*");
				}
			}
			if(rows<=2)
			{
				count = count+(n-1);
			}
			else
			{
				count=count-((rows-1)*(n-1));
			}
			System.out.println();
		}
	}
}