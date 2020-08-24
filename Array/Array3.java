import java.util.Scanner;
public class Array3
{
	public static void main(String[] args)
	{
		int[] a;
		int s,max,min;
		Scanner sc =new Scanner(System.in);
		s=sc.nextInt();
		a=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();	
		}
		max=a[0];
		min=a[0];
		for(int e:a)
		{
			if(max<e)
			{
				max=e;
			}
			if(min>e)
			{
				min=e;
			}		
		}
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
	}
}