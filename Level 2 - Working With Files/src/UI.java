import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	private static People hr;
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int choice;

		try {
			System.out.println("Welcome to HR system delux edition");
			hr = new People();
			choice = -1;
			while (choice != 0) {
				choice = getMenuItem();
				if (choice == 1) {
					System.out.println(hr.getPeople());
				} else if (choice == 2) {
					System.out.println("Enter Persons's name");
					String nm = myIn.readLine().trim();
					System.out.println("Enter Persons's Age");
					int a = Integer.parseInt(myIn.readLine());
					System.out.println("Enter Persons's Occupation");
					String oc = myIn.readLine().trim();
					Person temp = new Person(nm, a, oc);
					hr.addPerson(temp);
				} else if (choice == 3) {
					System.out.println("Enter Cthe Person's name");
					String nm = (myIn.readLine()).trim();
					hr.removePerson(nm);

				} else if (choice == 4) {
					System.out.println("Write to file");
					System.out.println("Enter filename");
					String nm = (myIn.readLine()).trim();
					hr.savePeople(nm);
				} else if (choice == 5) {
					System.out.println("Restore from file");
					System.out.println("Enter filename");
					String nm = (myIn.readLine()).trim();
					People hr2 = hr.loadPeople(nm);
					System.out.println(hr2.toString());
					System.out.println("Loaded");
				}

				else if (choice == 0) {
					System.out.println("Quitting");
				}
			}
			System.out.println(hr.toString());
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	private static int getMenuItem() throws IOException {
		int option = -1;
		System.out.println("Main Menu");
		System.out.println("1. list all personnel");
		System.out.println("2. add a person");
		System.out.println("3. remove a person");
		System.out.println("4. save hr session");
		System.out.println("5. restore hr session");
		System.out.println("0. quit");

		while (option < 0 || option > 5) {
			System.out.println("Enter the number of your choice");
			option = Integer.parseInt(myIn.readLine());
		}
		return option;
	}
}
