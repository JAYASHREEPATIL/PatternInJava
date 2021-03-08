import java.util.*;

public class DiamomdStar
{
	public static void main(String argsp[])
	{
		int n=7;
		int s=1;
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<s;j++)
			{
				System.out.print("*");
			}
			if(i>3)
			{
				s--;
			}
			else
			{
				s++;
			}
			System.out.println();
		}
	}
}