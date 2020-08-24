import java.util.Scanner;
public class Array10
{
	public static void main(String[] args)
	{
		int n,i,k,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		k=0;
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				temp=a[i];
				for(int j=i-1;j>=k;j--)
				{
					a[j+1]=a[j];
				}
				a[k]=temp;
				k++;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}		

		