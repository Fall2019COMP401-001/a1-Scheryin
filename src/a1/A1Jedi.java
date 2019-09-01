package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
	int count = scan.nextInt();
	String [] itemsInStore = new String[count];
	double[] price = new double[count];
	for(int i = 0; i<count; i++) {
		itemsInStore[i] = scan.next();
		price[i] = scan.nextDouble();
	}
	int numOfCust = scan.nextInt();
	String[] first = new String[numOfCust];
	String[] last = new String[numOfCust];
	double [] sumArr = new double[numOfCust];
	double sum = 0;
	for(int i = 0; i<numOfCust; i++) {
		first[i] = scan.next();
		last[i] = scan.next();
		int itemsBought = scan.nextInt();
		int[] quantity = new int[itemsBought];
		String[] nameOfItem = new String[itemsBought];
		for (int k = 0; k<itemsBought; k++) {
			quantity[k] = scan.nextInt();
			nameOfItem[k] = scan.next();
		}
	}
	}
}
