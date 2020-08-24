import java.util.Scanner;
public class Array8
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n0=0,n1=0,n2=0,s,i;
		s=sc.nextInt();
		int[] a=new int[s];
		for(i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
			{
				n0++;
			}
			if(a[i]==1)
			{
				n1++;
			}
			if(a[i]==2)
			{
				n2++;
			}
		}
		for(i=0;i<n0;i++)
		{
			a[i]=0;
		}
		for(i=0;i<n1;i++)
		{
			a[n0+i]=1;
		}
		for(i=0;i<n2;i++)
		{
			a[n0+n1+i]=2;
		}
		for(i=0;i<s;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}