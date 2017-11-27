import java.util.ArrayList;

public class Tester {
	private static ArrayList<Person> people = new ArrayList<Person>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addPerson(createPerson("Agent Stubbs", 29, "An Agent"));
		addPerson(createPerson("Kenzo Gabriel", 35, "Davila Aerospatiale"));
		addPerson(createPerson("Chrisjen Avasarala", 70, "Deputy Undersecretary of the United Nations"));

		System.out.println("List of people current in system: ");
		System.out.println(getPeople());
		
		System.out.println("\n\nSearching Chrisjen Avasarala by name");
		System.out.println((searchPersonByName("Chrisjen Avasarala")).toString());
	}
	
	private static void addPerson(Person p)
	{
		people.add(p);
	}
	
	
	private static Person createPerson(String s, int a, String js)
	{
		Person temp = new Person(s,a,js);
		return temp;
	}
	
	private static String getPeople()
	{
		String temp = "";
		
		for(Person p:people)
		{
			temp += p.toString();
		}
		return temp;
	}
	
	private static Person searchPersonByName(String s)
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
}
