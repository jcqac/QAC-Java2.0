
public class Paint 
{
	private String name;
	private double litres;
	private double cost;
	private double metreSq;
	
	public Paint(String nm, double li, double co, double sq)
	{
		name = nm;
		litres = li;
		cost = co;
		metreSq = sq;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getLitres()
	{
		return litres;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public double getMtSq()
	{
		return metreSq;
	}
	
	public double totalAreaCovered()
	{
		return litres*metreSq;
	}
	
	public String toString()
	{
		return "Paint: " + name + "\nLitres: " + litres + "l" +"\nCost: £" + cost + "\n Area Covered: " + metreSq +" metre^2" + "\nTotal Area Covered: " + metreSq + " metre^2"; 
	}
}
