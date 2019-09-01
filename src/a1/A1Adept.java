package a1;

import java.util.Scanner;

public class A1Adept {

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
		double[] customerTotal = new double[numOfCust];
		double sum = 0;
		for(int i = 0; i<numOfCust; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			int itemsBought = scan.nextInt();
			for (int k = 0; k<itemsBought; k++) {
				int quantity = scan.nextInt();
				String nameOfItem = scan.next();
				sum = 0;
				for (int j = 0; j<itemsInStore.length; j++) {
				if(itemsInStore[j].equals(nameOfItem)) {
					sum = price[j] * quantity + sum;
					customerTotal[i] = price[j] * quantity + customerTotal[i];
				}
			}

		}
		}
		double minCount = customerTotal[0];
		double minNameCount = 0;
		for (int p=1; p < customerTotal.length; p++) {
			if (customerTotal[p] < minCount) {
				minCount = customerTotal[p];
				minNameCount = p;
			}
		}
		double maxCount = customerTotal[0];
		double maxNameCount = 0;
		for (int p=1; p < customerTotal.length; p++) {
			if (customerTotal[p] < minCount) {
				maxCount = customerTotal[p];
				maxNameCount = p;
			}
		}
	//	double max = findValueMax(customerTotal);
		//double min = findValueMin(customerTotal);
		double avg = calculateAvg(customerTotal);
		System.out.println("Biggest: " + first[(int) maxNameCount] + " " + last[(int) maxNameCount] + " " + String.format("%.2f", maxCount));
		System.out.println("Smallest: " + first[(int) minNameCount] + " " + last[(int) minNameCount] + " " + String.format("%.2f", minCount));
		System.out.println("Average: " + String.format("%.2f", avg));
	}
	
	static double calculateAvg(double[] price) {
		
		double avg = 0;
		
		for (int i=0; i<price.length; i++) {
			avg += price[i];
		}
		
		return avg/price.length;
	}
	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}
	}