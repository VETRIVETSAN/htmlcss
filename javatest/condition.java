import java.util.Scanner;
class condition
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{

		System.out.println("Enter number");
		int number =sc.nextInt();

		String result=(number>=0)? "postive no": "negative no";
		System.out.println("the number "+  number + " is "+ result);
	}

}
