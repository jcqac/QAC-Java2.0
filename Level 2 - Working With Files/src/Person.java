
public class Person implements java.io.Serializable{
	
	private String name;
	private int age;
	private String occupation;
	
	public Person(String s, int a, String oc)
	{
		setName(s);
		setAge(a);
		setOccupation(oc);
		
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setOccupation(String oc)
	{
		occupation = oc;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getOccupation()
	{
		return occupation;
	}
	
	public String toString()
	{
		return "Name: " + name + " Age: " + age + " Occupation: " + occupation + "\n";
	}
}
