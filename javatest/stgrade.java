class stgrade 
{
	public static void calculategrade(double score) 
	{
		if (score>=90)
		{
			return "a" ;
		}
		else if (score>=80)
		{
			return "b";
		}
		else if (score>=70)
		{
			return "c";
		}
		else if (score>=60)
		{
			return "d";
		}
		else
		{
			return "f";
		}
	}
	public static void main(String []args)
	{
		double studentscore=85;
		String grade=calculategrade(studentscore);
		System.out.println("the student's grade is:"+grade);
	}
}