class ex1
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[]args)
	{
		int num1=5;
		int num2=10;
		int sum=add(num1,num2);//method call to add
		System.out.println("the sum of "+num1+" and "+num2+" is :"+sum);

	}
}