package main;
import java.util.Scanner;

public class Converter {
	public static void cupsToTeaspoons(float value) {
		System.out.println(value + " Cups is " + value * 48 + " Teaspoons");
	}
	
	public static void milesToKilometers(float value){
		System.out.println(value + " Miles is " + value * 1.609 + " Kilometers");
	}
	
	public static void usToImperialGallons(float value) {
		System.out.println(value + " US Gallons is " + value/1.201 + " Imperial Gallons");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			//do nothing
			try {
					System.out.println("Please select an option:\n"
							+ "1. Cups to Teaspoons\n"
							+ "2. Miles to Kilometers\n"
							+ "3. US Gallons to Imperial Gallons \n"
							+ "4. Quit");
		
		int option = Integer.valueOf(scanner.nextLine());
		if (option==4) {
			break;
		}
		System.out.println("Enter a value.");
		float value = Float.parseFloat(scanner.nextLine());
		switch (option) {
		case 1:
			cupsToTeaspoons(value);
			break;
		case 2:
			milesToKilometers(value);
			break;
		case 3:
			usToImperialGallons(value);
			break;
		}
	} catch(Exception e) {
		System.out.println("You got " + e + ". Please try again.");
			}
		}
	}
}		