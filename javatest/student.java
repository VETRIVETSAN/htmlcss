import java.util.Scanner;
class student
{
	static Scanner sc=new Scanner(System.in);
	static public void main(String [] Vetri)throws Exception
	{
		System.out.println("Enter Student Name :");
		String name=sc.nextLine();

		System.out.println("Enter University Name");
		String university=sc.nextLine();

		System.out.println("Enter Student Id");
		int id=sc.nextInt();

		sc.nextLine();//OverComing the problem

		System.out.println("Enter Student Best Friend");
		String bst_frnd=sc.nextLine();

		System.out.println("Enter Student YOP");
		int yop=sc.nextInt();

		System.out.println("Enter Student Percentage");
		double per=sc.nextDouble();

		System.out.println("Enter Student First Letter");
		char ch=sc.next().charAt(0);

		System.out.println("Processing.....");
		Thread.sleep(2000);

		System.out.println("Name :"+name);
		System.out.println("University :"+university);
		System.out.println("Student Id :"+id);
		System.out.println("Best Friend :"+bst_frnd);
		System.out.println("Year Of Passed Out :"+yop);
		System.out.println("Percentage :"+per);
		System.out.println("First Letter :"+ch);
	}


}