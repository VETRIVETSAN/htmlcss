import java.util.Scanner;
class palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number"); 
		int number=sc.nextInt();
		int temp=number;
		int res=0;

		while (number>0)
		{
			res=(res*10)+(number%10);
			number=number/=10;

		}
		String res1=(res==temp)? " palindrome":" not palindrome";

	
		System.out.println("the given "+temp+res1);
	}
}