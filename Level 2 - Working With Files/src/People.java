import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class People implements java.io.Serializable{
	private ArrayList<Person> people = new ArrayList<Person>();
	
	
	public void addPerson(Person p)
	{
		people.add(p);
	}
	
	public void removePerson(String s)
	{
		people.remove(searchPersonByName(s));
	}
	
	
	public Person createPerson(String s, int a, String js)
	{
		Person temp = new Person(s,a,js);
		return temp;
	}
	
	public String getPeople()
	{
		String temp = "";
		
		for(Person p:people)
		{
			temp += p.toString();
		}
		return temp;
	}
	
	public Person searchPersonByName(String s)
	{
		for(Person p:people)
		{
			if((p.getName()).equals(s))
			{
				return p;
			}
		}
		return null;
	}
	
	public void savePeople(String fname)
	{	// uses object serialisation
		try
        {
            ObjectOutputStream oFile = new ObjectOutputStream(new FileOutputStream(fname+".dat"));
            oFile.writeObject(this);
            oFile.writeObject(null);
            oFile.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
	}
	
	public People loadPeople(String fname)
	{
	    {   // uses object serialisation         
	        try
	        {
	            ObjectInputStream iFile = new ObjectInputStream(new FileInputStream(fname+".dat"));
	            People temp = (People) iFile.readObject();            
	            this.people = temp.people;
	            return temp;
	        }
	        catch(IOException ex)
	        {
	            ex.printStackTrace();
	        }
	        catch(ClassNotFoundException ex)
	        {
	            ex.printStackTrace();
	        }
	        return null;
	    }
	}
	
}
