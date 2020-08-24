import java.util.Scanner;
public class Array2
{
	public static void main(String[] args)
	{
		int[] a;
		int n,s,p=0;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		s=sc.nextInt();
		a=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int e:a)
		{
			if(e==n)
			{
				System.out.print("True");
				p=1;
				break;
			}
		}
		if(p!=1)
		{
			System.out.print("False");
		}		
	}
}