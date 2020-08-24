import java.util.Scanner;
public class Array6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int k,n,t;
		k=sc.nextInt();
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Largest:"+a[n-k]);
		System.out.println("Smallest:"+a[k-1]);
	}
}