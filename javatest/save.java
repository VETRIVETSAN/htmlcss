class save
{
	public static void main(String[] args) 
	{

		int a=10;
		int res=(a++ +a++);

		System.out.println(a);

		res=(res++ + a++);
		System.out.println(res+" ; "+a);
	}
}

op:
*//
12
33 ; 13