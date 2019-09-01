package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numberOfItems = scan.nextInt();
		for (int i = 0; i<numberOfItems; i++) {
			String[] itemName = new String[numberOfItems];
			itemName[i] = scan.next();
			double[] price = new double[numberOfItems];
			price[i] = scan.nextDouble();
		}
		int totalNumberOfCustomers = scan.nextInt();
		String[] firstName = new String[totalNumberOfCustomers];
		String[] lastName = new String[totalNumberOfCustomers];
		int[] itemsBought = new int[totalNumberOfCustomers];
		int[] quantity = new int[totalNumberOfCustomers];
		String[] itemName2 = new String[totalNumberOfCustomers];
		double[] sumsArr = new double[totalNumberOfCustomers];
		double sum = 0;
		for (int i = 0; i<totalNumberOfCustomers; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			itemsBought[i] = scan.nextInt();
			sum = 0;
			for (int k = 0; k<itemsBought[i]; k++) {
				quantity[k] = scan.nextInt();
				itemName2[k] = scan.next();
					}
				}
	}
}

