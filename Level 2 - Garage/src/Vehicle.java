
public abstract class Vehicle 
{
	private static int idCount = 0;
	private int id;
	private String vehicleType;
	private String numberPlate;
	private String manufacturer;
	private String model;
	private String engineType;
	private int wheels;
	private boolean isFixed;

	public Vehicle(String vehType, String nPlate, String man, String mod, String eType, int wheel)
	{
		vehicleType = vehType;
		numberPlate = nPlate;
		manufacturer = man;
		engineType= eType;
		model = mod;
		wheels = wheel;
		isFixed = false;
		idCount ++;
		id = idCount;
	}
	
	//public abstract String noise();

	
	public int getId()
	{
		return id;
	}
	
	public String getNumberPlate()
	{
		return numberPlate;
	}
	
	public void setNumberPlate(String nPlate)
	{
		numberPlate = nPlate;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String manf)
	{
		manufacturer = manf;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String mod)
	{
		model = mod;
	}
	
	public String getEngineType()
	{
		return engineType;
	}
	
	public void setEngineType(String eType)
	{
		engineType = eType;
	}
	
	public int getNumberWheels()
	{
		return wheels;
	}
	
	public void setNumberWheels(int w)
	{
		wheels = w;
	}
	
	public String getStringID()
	{
		return ""+ id;
	}
	
	public void setFixed()
	{
		isFixed = true;
	}
	
	public String type()
	{
		return vehicleType;
	}
	
	public String toString()
	{
		return "\nVehicle ID: " + id + "\nVehicle Type: " + vehicleType +"\nNumber Plate: " + numberPlate + "\nManufacturer: " + manufacturer + "\nModel: " + model 
		        + "\nEngine Type: " + engineType + "\nNumber of Wheels: " + wheels + "\nIs Fixed? " + isFixed;
	}
}
