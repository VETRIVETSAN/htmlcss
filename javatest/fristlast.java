class fristlast 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter the number");
		int number=sc.nextInt();
		int last=number%10,sum=0;

		while (number>9)
		{
			number/10;
		}
		sum=number+last;
		System.out.println("sum of first and last is:"+sum);
	}
}