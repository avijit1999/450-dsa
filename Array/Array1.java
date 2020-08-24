import java.util.Scanner;
public class Array1
{
	public static void main(String[] args)
	{
		int[] a;
		a=new int[10];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}
}