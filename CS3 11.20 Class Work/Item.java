/*
UML 1

class Item

- String itemName
-  double itemPrice
- int itemQuality
+Item() //constructor
+Item(String, double, int)

+ void setItemName(String)
+ String getItemName()
+ void setitemPrice(double)
+ double itemPrice()
+ void setItemQuality(int)
+ int getItemQuality
+ toString()
+ equals()
+ print()

UML Class ShoppingCart
+ main()


*/


class Item {
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	Item() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	Item (String name, double price, int quantity) {
		itemName = name;
		itemPrice = price;
		itemQuantity = quantity;
	}
	
	String getItemName() {
		return itemName;
	}
	double getItemPrice() {
		return itemPrice;
	}
	int getItemQuantity() {
		return itemQuantity;
	}
	
	void setItemName(String name) {
		itemName = name;
	}
	void setItemPrice(double price) {
		itemPrice = price;
	}
	void setItemQuantity(int quantity) {
		itemQuantity = quantity;
	}
	
	public String toString() {
		return (itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
	}
	public void print() {
		String temp = toString();
		System.out.println(temp);
	}
	public Boolean equals(Item i) {
		return ( (i.getItemName().equals(itemName)) && (i.getItemPrice() == itemPrice) && (i.getItemQuantity() == itemQuantity) );
	}
}
