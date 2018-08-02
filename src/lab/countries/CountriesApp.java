package lab.countries;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		
		//TODO Variables
		Scanner scan = new Scanner(System.in);
		int usersChoice;
		String firstMenu = "\n1. See the list of countries \n"
						 + "2. Add a country \n"
						 + "3. Exit \n"
						 + "Enter menu number: ";
		
		//TODO Menu with first options 
		
		//TODO It should come back every time it chooses 1 or 2
		System.out.println("Welcome to the Countries Maintenance Application!");

		
		do {
			System.out.println(firstMenu);
			usersChoice = scan.nextInt();
			scan.nextLine();
			
			if (usersChoice == 2) {
				System.out.println("\nPlease enter the country: ");
				String userCountry = scan.nextLine();
				CountriesTextFile.writeToFile(userCountry);
			} else if (usersChoice == 1) {
				System.out.println("\n");
				CountriesTextFile.readFromFile();
			}
			else {
				break;
			}
		} while (usersChoice >= 1 || usersChoice <= 2);
		
		System.out.println("Tchau!");
		

	}

}
