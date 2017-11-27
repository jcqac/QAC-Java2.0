
public class Motorbike extends Vehicle
{
	private int cc;
	public Motorbike(String nPlate, String man, String mod, String eType, int wheel, int c)
	{
		super("Motorbike", nPlate, man, mod, eType, wheel);
		cc = c;
	}
	
	public int getCc()
	{
		return cc;
	}
	
	public String toString()
	{
		return super.toString() + "\nCC: " + cc;
	}
	
}
