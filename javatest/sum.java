class sum 
{
	public static int sum(int...numbers) 
	{
		int total=0;
		for (int num:numbers )
		{
			total+=num;
		}
		return total;
	}
	public static void main(String[]args)
	{
		int result1=sum(1,2,3);
		int result2=sum(10,20,30,40,50);
		System.out.println("result 1:"+result1);
		System.out.println("result 2:"+result2);
	}

}
op
*
//
result 1:6
result 2:150
//
*