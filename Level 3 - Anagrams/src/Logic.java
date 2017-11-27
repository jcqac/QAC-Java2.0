import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Logic{
	private ArrayList<String> wordList = new ArrayList<String>();
	private HashMap<String,ArrayList<String>> anagramList = new HashMap<String,ArrayList<String>>();
	
	//Method to load wordlist
	public void loadWordList(String fName)
	{
		try 
		{
			Scanner in = new Scanner(new FileReader(fName));
			while(in.nextLine() != null)
			{
				addToArl(in.next(), wordList);
			}
			in.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
	
	//Method to sort and add to appropriate wordlists.
	public void findAnagrams()
	{
		for(String s : wordList)
		{
			String key = sortString((s.toLowerCase()));
			if (checkAKey(key))
			{
				addToArl((s.toLowerCase()), retrieveAnagram(key));
			}
			else
			{
				ArrayList<String> temp = new ArrayList<String>();
				addToArl((s.toLowerCase()), temp);
				addAnagramList((s.toLowerCase()), temp);
			}
		}
	}
	
	//Method to compare two Strings - outputs whichever has more anagrams, should they be equal than the longer String will be outputted, if this is also equal than both Strings will be outputted.
	public String twoStringComp(String s1, String s2)
	{
		if(checkAKey(s1) || checkAKey(s2))
		{
			int la = 0;
			int lb = 0;
			if (checkAKey(s1))
			{
				la = arSize(retrieveAnagram(s1));
			}
			if (checkAKey(s2))
			{
				lb = arSize(retrieveAnagram(s2));
			}
			
			if(la == lb)
			{
				if (s1.length() == s2.length())
				{
					return s1 + ", " + s2;
				}
				else if (s1.length() > s2.length())
				{
					return s1;
				}
				else
				{
					return s2;
				}
			}
			else if(la > lb)
			{
				return s1;
			}
			else
			{
				return s2;
			}
		}
		else
		{
			return "Both words are not in list";
		}	
	}
	
	//Method to return the arrayList with the largest amount of anagrams
	public ArrayList<String> longestAnArList()
	{
		return retrieveAnagram(longestAnagramKey());
	}
	
	//Method to find longest list of Anagrams in our list
	public String longestAnagram()
	{
		
		return "Key: " + longestAnagramKey() + " has the most amount of anagrams at: " + arSize(retrieveAnagram(longestAnagramKey())) + " Anagrams.";
	}
	
	//Returns the key of the hashmap entry with the most anagrams
	public String longestAnagramKey()
	{
		int wordCount = 0;
		String hashKey = null;
		for (String key : anagramList.keySet())
		{
			int temp = arSize(retrieveAnagram(key));
			if(temp > wordCount)
			{
				wordCount = temp;
				hashKey = key;
			}
		}
		return hashKey;
	}
	
	public String sortString(String s)
	{
		char[] temp = (s.toLowerCase()).toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	
	//Adds words to the wordlist
	public void addWordList(String s)
	{
		wordList.add((s.toLowerCase()));
	}
	//Adds results to hashmap
	public void addAnagramList(String s, ArrayList<String> al)
	{
		anagramList.put((s.toLowerCase()),al);
	}

	//Retrieves wordlist from hashmap
	public ArrayList<String> retrieveAnagram(String s)
	{
		return anagramList.get((s.toLowerCase()));
	}
	
	//Checks if key exists for anagram hashmap
	public boolean checkAKey(String s)
	{
		return anagramList.containsKey((s.toLowerCase()));
	}
	
	//Below are methods for arraylists.
	public void addToArl(String s,  ArrayList<String> al)
	{
		al.add((s.toLowerCase()));
	}
		//This checks the length of the arrayslists
	public int arSize(ArrayList<String> al)
	{
		return al.size();
	}
		//Returns all the Strings in the list
	public String returnArResult(ArrayList<String> al)
	{
		String temp = "";
		for(String s: al)
		{
			temp += (s + "\n");
		}
		return temp;
	}
}
