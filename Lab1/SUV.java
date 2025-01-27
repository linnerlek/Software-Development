public class SUV extends Automobile 
{
	private int numpass;
	private double cargospc;
	
	public SUV(String mk, String md, int y, int nw, int np, double c) 
	{
		super(mk, md, y, nw); // allows us to use the constructor from the parent class
		numpass = np;
		cargospc = c;
	}
	
	public void getinfo() 
	{
		super.getinfo(); // gets the info from the parent class before adding the new info
        System.out.println("    Passengers: " + numpass);
        System.out.println("    Cargo space: " + cargospc);
	}
}
