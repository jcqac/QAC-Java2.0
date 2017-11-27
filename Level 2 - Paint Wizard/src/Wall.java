//Mexico has to pay for it all - Trump 2016
public class Wall 
{
	private double width;
	private double height;
	
	public Wall(double wid, double hig)
	{
		setWidth(wid);
		setHeight(hig);
	}
	
	public double returnWidth()
	{
		return height;
	}
	
	public double returnHeight()
	{
		return height;
	}
	
	public void setHeight(double hig)
	{
		height = hig;
	}
	
	public void setWidth(double wid)
	{
		width = wid;
	}
	
	public double calArea()
	{
		return width*height;
	}
}
