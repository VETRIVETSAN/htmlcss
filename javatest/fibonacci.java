import java.util.Scanner;
class fibonacci 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the n series");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;

		for (int i=1;i<=n;i++ )
		{
			System.out.print(n1+"  ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
/*output
enter the n series
10
0  1  1 2  3  5  8  13  21  34
*/