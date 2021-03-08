import java.util.*;
//in dev change
//again change in dev
public class Bitwise
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		a[0]=1;
		int k=0;
		int result=0;
		int x=n-1;
		int c=1;
		for(int i=1;i<n;i++)
		{
			a[i]=k;
			k++;
		}
		while(x>=0)
		{
			result=result+c*(a[x]);
			c++;
			x--;
		}
		System.out.println("OP: "+result);
	}
}