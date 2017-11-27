import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
	private static Logic ana;
	private static BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int choice;
		try {
			System.out.println("Welcome to the Anagram Games");
			ana = new Logic();
			choice = -1;
			while (choice != 0) {
				choice = getMenuItem();
				if (choice == 1) {
					System.out.println(ana.longestAnagram());
				} else if (choice == 2) {
					System.out.println(ana.returnArResult(ana.longestAnArList()));
				} else if (choice == 3) {
					System.out.println("Enter first word");
					String s1 = myIn.readLine().trim();
					System.out.println("Enter second word");
					String s2 = myIn.readLine().trim();
					System.out.println(ana.twoStringComp(s1, s2));
				} else if (choice == 4) {
					System.out.println("Load word list file");
					System.out.println("Enter filename");
					String nm = (myIn.readLine()).trim();
					ana.loadWordList(nm);
					//ana.findAnagrams();
					System.out.println("Loaded");
				}
				else if (choice == 0) {
					System.out.println("Quitting");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private static int getMenuItem() throws IOException {
		int option = -1;
		System.out.println("Main Menu");
		System.out.println("1. Find longest anagram (key)");
		System.out.println("2. Output longest anagram list");
		System.out.println("3. Compare two words - which has more anagrams");
		System.out.println("4. Load word list");
		System.out.println("0. quit");

		while (option < 0 || option > 4) {
			System.out.println("Enter the number of your choice");
			option = Integer.parseInt(myIn.readLine());
		}
		return option;
	}
}
