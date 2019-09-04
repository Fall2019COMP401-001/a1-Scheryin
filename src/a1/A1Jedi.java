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
				int[] howManyCus = new int[itemsInStore.length];
				int[] quantityBought = new int[itemsInStore.length];

				for(int i = 0; i<numOfCust; i++) {
					first[i] = scan.next();
					last[i] = scan.next();
					int itemsBought = scan.nextInt();
					boolean[] check = new boolean[itemsInStore.length];

					for (int k = 0; k<itemsBought; k++) {
						int quantity = scan.nextInt();
						String[] nameOfItem = new String[itemsBought];
						nameOfItem[k] = scan.next();
						for (int j = 0; j<itemsInStore.length; j++) {
							if(nameOfItem[k].equals(itemsInStore[j])) {
								quantityBought[j] += quantity;
								if(!check[j]) {
									howManyCus[j]++;
									check[j] = true;
					}
						}
						
						}
						
					}
						
				}
						
						
					
				for(int i = 0; i<itemsInStore.length; i++) {
					if(quantityBought[i] > 0) {
				System.out.println(howManyCus[i] + " customers bought " + quantityBought[i] + " " + itemsInStore[i]);
					} else {
						System.out.println("No customers bought " + itemsInStore[i]);
					}
				}
	}
	}
