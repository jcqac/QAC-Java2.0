
public class Tester 
{

	public static void main(String[] args) 
	{
		// Create some vehicles
		Car one = new Car("LL02SJW", "VW", "Polo", "Diesel", 4, 5, 1.4, "Hatchback");
		Car two = new Car("LR16SJW", "Toyota", "GT-86", "Petrol", 4, 2, 2.0, "Coupé");
		
		Van three = new Van("EY08SJW", "Ford", "Transit", "Diesel", 4, 4, 1.8, 3500, 800);
		Van four = new Van("GF56SJW", "Mercedes", "Sprinter", "Diesel", 4, 4, 2, 4000, 1000);
		
		Motorbike five = new Motorbike("AB11SJW", "Suzuki", "R1", "Petrol", 2, 250);
		Motorbike six = new Motorbike("SJ56SJW", "Honda", "Cub", "Petrol", 2, 50);
		
		// Create Garage
		Garage test = new Garage(150);
		
		// Add above vehicles to Garage
		test.addToGarage(one);
		test.addToGarage(two);
		test.addToGarage(three);
		test.addToGarage(four);
		test.addToGarage(five);
		test.addToGarage(six);
		
		System.out.println("~~ BEGIN TEST ~~ \n");
		System.out.println("Added " + test.size() + " To Garage");
		
		// Print list of vehicles
		System.out.println("\n## Current List of Vehicles 1 ##");
		System.out.println(test.listAllVeh());
		
		//Fix car, van and motorbike
		System.out.println("\nFix vehicles with ID 2, 4, 5");
		
		System.out.println(test.doFix("2"));
		System.out.println(test.doFix("4"));
		System.out.println(test.doFix("5"));
		
		// Remove van and motorbike
		System.out.println("\n~~ Current List of Vehicles 2 ~~");
		System.out.println(test.listAllVeh());
		
		System.out.println("\nRemove Vehicles with ID 2, 4, 5");
		test.removeFromGarage("2");
		test.removeFromGarage("4");
		test.removeFromGarage("5");
		
		System.out.println("\nVehicles left in Garage " + test.size());		
		// List all vehicles again
		System.out.println(" *# Current List of Vehicles 3 #*");
		System.out.println(test.listAllVeh());
		
		//clear garage
		System.out.println("\nClear Garage");
		test.clearAllFromGarage();
		System.out.println("\nVehicles left in Garage " + test.size());
		
		System.out.println("\n### END TEST ###");
		
		
		//End
		
	}

}
