
public class Person {
	
	private String name;
	private int age;
	private String jobTitle;
	
	public Person(String s, int a, String js)
	{
		setName(s);
		setAge(a);
		setJobTitle(js);
		
	}
	
	public void setName(String s)
	{
		name = s;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setJobTitle(String js)
	{
		jobTitle = js;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	public String toString()
	{
		return "Name: " + name + " Age: " + age + " Job Title: " + jobTitle + "\n";
	}
}
