class predcop
{
	public static void main(String[] args) 
	{

		int a=10;
		int res=(a++ +a++);

		System.out.println(a);

		res=(res++ + a++);
		System.out.printing(res+" ; "+a);
	}
}
