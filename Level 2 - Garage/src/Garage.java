import java.util.*;

public class Garage 
{

	private double baseCost;

	private HashMap<String,Vehicle> allVehicles = new HashMap<String,Vehicle>();
	
	public Garage(double bc)
	{
		baseCost = bc;
	}
	
	public double baseCost()
	{
		return baseCost;
	}
	
	public void setBaseCost(double bc)
	{
		baseCost = bc;
	}
	
	public double carCost(Car ca)
	{
		return baseCost + ((ca.getNoDoors() + ca.getNumberWheels())*20);
	}
	
	public double vanCost(Van va)
	{
		return baseCost + ((va.getMaxCapacity() + va.getMaxCapacity())/20);
	}
	
	
	public double motorBikeCost(Motorbike mo)
	{
		return baseCost + (mo.getCc());
	}
	
	
	public void addToGarage(Vehicle veh)
	{
		allVehicles.put(veh.getStringID(), veh);
	}
	 
	public void removeFromGarage(String id)
	{
		allVehicles.remove(id);
	}
	
	public void clearAllFromGarage()
	{
		allVehicles.clear();
	}
	 
	public double getBill (Vehicle veh)
	{
		if(veh instanceof Car)
		{
			return carCost((Car)veh);
		}
		else if(veh instanceof Van)
		{
			return vanCost((Van)veh);
		}
		else if (veh instanceof Motorbike)
		{
			return motorBikeCost((Motorbike)veh);
		}
		else
		{
			return -1;
		}
		
	}
	
	public Vehicle findVehByID(String id)
	{
		Vehicle temp = allVehicles.get(id);
		return temp;
	}
	
	public String listAllVeh()
	{
		Collection<Vehicle>col = allVehicles.values();
		String temp = "";
		for(Vehicle veh : col)
		{
			temp += "\n"+ veh.toString();
		}
		return temp;
	}
	
	public void fix(String id)
	{
		Vehicle temp = findVehByID(id);
		temp.setFixed();
	}
	
	public String doFix(String id)
	{
		this.fix(id); 
		Vehicle temp = findVehByID(id);
		String s = "\nVehicle ID: " + temp.getId() + ", Vehicle Type: " + temp.type() + ", Registration: " + temp.getNumberPlate() + ", Manufacture: " + temp.getManufacturer() + ", Model: " + temp.getModel() + ", Has Been Fixed for: £" + this.getBill(temp);
		return s;
	}
	
	public int size()
	{
		return allVehicles.size();
	}
	 
	
}

