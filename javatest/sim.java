class Sim
{
	//states
	String sname;
	long sim_contact;
	double price;
	String band_width;

	//constru
	public Sim()
	{
		//li
	}
	public Sim(String sname,String band_width,long sim_contact,double price){
		//li
		this.sname=sname;
		this.band_width=band_width;
		this.sim_contact=sim_contact;
		this.price=price;
	}


	//behavi
	public void detailsOfSim(){
		//non-static context
		System.out.println("the sim name:"+sname);
		System.out.println("band width is:"+band_width);
		System.out.println("contact:"+sim_contact);
		System.out.println("price:"+price);
		System.out.println(" ************************");
	}
}

		
			











