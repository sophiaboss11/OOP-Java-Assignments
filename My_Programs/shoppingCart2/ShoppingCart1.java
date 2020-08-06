/*
            ShoppingCart
-	cartItems   : ArrayList<Item>  // Using composition 
-	customerName : String
-	currentDate : String

+  ShoppingCart()
+  ShoppintCart(String name, String date)
+  getName(): String
+  getDate(): String
+  getNumOfItems(): int 
+  removeItem(Item): void
+  addItem(Item): void 
+  modifyItem(Item) : void
+  getCost(): double
+  setName(String): void
+  setDate(String): void 
+  printBill(): void
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCart1 {
    private ArrayList<Item1> cartItems = new ArrayList<>();
    private String customerName, currentDate ;
    
    void ShopingCart1(){
        customerName = "Johe Doe" ;
        currentDate = "Aug. 8, 2020";
    }
    void ShopingCart1(String name, String currentDate ){
        customerName = name;
        this.currentDate = currentDate;
    }
    public ArrayList<Item1> getCartItems(){
        return cartItems;
    }
    void addItem(Item1 i1){
        if (i1 != null)
            cartItems.add(i1);
    }
    void removeItem(Item1 i1){
        cartItems.remove(i1);
    }
    int getNumOfItems(){
        return cartItems.size();
    }
    double getCost(){
        double cost = 0;
        for(Item1 i1 : cartItems)
            cost += i1.getPrice()* i1.getQuantity();
        return cost;
    }
    void setName(String myName){
        customerName = myName;
    }
    String getName(){
        return customerName;
    }
    void setDate(String date){
        currentDate = date;
    }
    String getDate(){
        return currentDate;
    }
    void modifyItem(Item1 obj){
        Scanner in = new Scanner(System.in);
        System.out.println("enter new name: ");
        obj.setName(in.nextLine());
        System.out.println("enter new price: ");
        obj.setPrice(in.nextDouble());
        System.out.println("enter new quantity: ");
        obj.setQuantity(in.nextInt());

        in.close();

    }
    void printBill(){
        System.out.println("\tBill\n" + "name: " + getName() + "\ndate: " + getDate() + "\ncost: " + getCost() + "\nnumber of items: " + getNumOfItems());
    }

}
