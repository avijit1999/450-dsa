import java.util.Scanner;
public class Array4
{
	public static void main(String[] args)
	{
		int[] a;
		a=new int[10];
		int n,t,i;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(i=0;i<(n/2);i++)
		{
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}