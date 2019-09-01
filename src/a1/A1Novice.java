package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalCustomers = scan.nextInt();
		
		String[] customerNames = new String[totalCustomers];
		String[] customerLastNames = new String[totalCustomers];
		int[] items = new int[totalCustomers];
		double[] sumsArr = new double[totalCustomers];
		double sum = 0;
		for(int i = 0; i<customerNames.length; i++) {
			customerNames[i] = scan.next();
			customerLastNames[i] = scan.next();
			items[i] = scan.nextInt();
			sum = 0;
			for(int k = 0; k<items[i]; k++) {
				int[] quantity = new int[totalCustomers];
				quantity[k] = scan.nextInt();
				String[] itemName = new String[totalCustomers];
				itemName[k] = scan.next();
				double[] price = new double[totalCustomers];
				price[k] = scan.nextDouble();
				sum = price[k] * quantity[k] + sum;
			}
			sumsArr[i] = sum;
		}
	for(int i = 0; i<totalCustomers; i++) {
		System.out.println(customerNames[i].charAt(0) + ". " + customerLastNames[i] + ": " + String.format("%.2f", sumsArr[i]));
	}
	}
}
