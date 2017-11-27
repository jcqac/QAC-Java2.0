import java.text.DecimalFormat;
import java.util.ArrayList;

public class Logic 
{
	private ArrayList<Paint> allPaints = new ArrayList<Paint>();
	private Room room;
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void addRoom(Room rm)
	{
		room = rm;
	}
	
	public void addPaint(Paint pt)
	{
		allPaints.add(pt);
	}
	
	public double calculateCosts(Paint pt)
	{
		return (paintCansReq(pt))*pt.getCost();
	}
	
	public double paintCansReq(Paint pt)
	{
		return Math.ceil((room.totalArea()/pt.totalAreaCovered()));
	}
	
	public String formatCosts()
	{
		String temp = "";
		for(Paint paint: allPaints)
		{
			temp += paint.getName() + " will cover a total of " + df.format(paint.totalAreaCovered()) + "m^2" + " each can will cost: £" + df.format(paint.getCost())
					+ "\nYour room has the surface area of " + df.format(room.totalArea()) + "m^2" + " you will need " +  (int)Math.ceil((room.totalArea()/paint.totalAreaCovered())) + " cans of paint"
					+ "\neach can costs: £" + df.format(paint.getCost()) + " so the total cost is: £" + df.format(calculateCosts(paint)) + "\n\n";
		}
		return temp;
	}
		
	public String findCheapest()
	{
		String temp = "";
		double lcost = 0;
		for(Paint paint: allPaints)
		{
			double tcost = calculateCosts(paint); 
			if (tcost < lcost || lcost == 0)
			{
				lcost = tcost;
				temp = paint.getName() +" is the cheapest at total cost of: £" + df.format(lcost);
			}		
		}
		return temp;
	}
	
	public String wasteLeast()
	{
		String temp = "";
		double lArea = 0;
		for(Paint paint: allPaints)
		{
			double tArea = (paintCansReq(paint)*paint.totalAreaCovered()) - room.totalArea(); 
			if (tArea < lArea || lArea == 0)
			{
				lArea = tArea;
				
				double lLitre = lArea/ paint.getMtSq();
				temp = paint.getName() +" wastes the least leaving you " + df.format(lLitre) + "l left. This is enough to cover " + df.format(lArea) + "m^2";
			}		
		}
		return temp;
	}
}
