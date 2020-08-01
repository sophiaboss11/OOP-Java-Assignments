/*
UML 2

class ShoppingCart

+Scanner scnr
+String name
+double price
+int quantity
+Item[] items
+int numItems
+double total

+ main()

*/
import java.util.Scanner;

class ShoppingCart {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("\ntest1");
		String name;
		double price;
		int quantity;
				
		Item[] items = new Item[100];
		int numItems = 1;
		double total = 0;
		
		while (true) {
			name = scnr.nextLine();
			if (name.contentEquals("none")) {
				break;
			}
			
			price = scnr.nextDouble();
			quantity = scnr.nextInt();
			
			Item temp = new Item(name, price, quantity);
			items[numItems - 1] = temp;
			scnr.nextLine();
			
			total += (price * quantity);

			numItems++;
		}
		
		System.out.println("\nTOTAL COST");
		for (int i = 0; i < numItems - 1; i++) {
			items[i].print();
		}
		System.out.println("\nTotal: $" + total);
	}
}



