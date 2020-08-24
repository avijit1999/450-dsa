import java.util.Scanner;
public class Array5
{
	public static void main(String[] args)
	{
		int[] a;
		int s,t;
		Scanner sc =new Scanner(System.in);
		s=sc.nextInt();
		a=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();	
		}
		t=a[0];
		for(int i=0;i<s;i++)
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
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}
}