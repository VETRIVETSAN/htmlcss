import java.util.Scanner;
class favfood
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter the number");
		String result=favfood(sc.nextLine());
		System.out.println(result);

	}
	public static String favfoode(String person)
	{
		System.out.println("\t\t\t select your favfood");
		System.out.println("1.mutton briyani\n2.fried rice\n3.parotta");
		int user_input=sc.nextInt();

		switch (user_input)
		{
		case 1:
			{ 
				return person+": favfood is mutton briyani  ";
			}
		case 2:
			{
				return person+": favfood is  fried rice  ";
				
			}
		case 3:
			{
				return person+": favfood is parotta ";
			}
			
		
		}
		return "something went wrong:"+person;
	}
}
