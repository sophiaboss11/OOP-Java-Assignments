/*
-- UML --
class GoShopping

+ Scanner 
+ Boolean
+ ShoppingCart 1

+ main()
+ menu()
+ ask()
+ askAdd()
+ askRemove()
*/
import java.util.Scanner;

public class GoShopping{
    public static Scanner in = new Scanner(System.in);
    public static Boolean isTrue = true;
    public static ShoppingCart1 sc = new ShoppingCart1();

    public static void main(String args[]){
        try {
            System.out.println("Enter your name");
            sc.setName(in.nextLine());
            System.out.println("Enter the date");
            sc.setDate(in.nextLine());
            System.out.print("Name and date added. ");


            menu();  

        } 
        catch(Exception e){
            System.out.println("invalid input");
            System.exit(0);
        }
    }

    public static void menu(){
        
        boolean is =  true;
        while(is){

            ask();
            askRemove();
            readItem();

            System.out.println("Would you like to continue? Answer yes or no.");
            String answer = in.nextLine();

            if(!answer.equals("yes")){
                System.out.println("--Thank you for shopping-- \n");
                is = false;
            }
        }
        sc.printBill();
    }

    public static void readItem(){
        System.out.println("Would you like to inspect an item? Type item name or no.");
        String itemName = in.nextLine();
        boolean hasItem = false;
        if(itemName.equals("no")){
            System.out.println("quitting section");
            return;
        }
        for(int i = 0 ; i < sc.getNumOfItems() ; i++){
            if(sc.getCartItems().get(i).getName().equals(itemName)){
                System.out.println("printing Item information");
                sc.getCartItems().get(i).printInfo();
                System.out.println("\n");
                hasItem = true;
            }
        }
        if(hasItem = false){
            System.out.println("invalid item name");
        }
    }

    public static void ask(){
        while(isTrue){
            System.out.println("would you like to add an item? Answer yes or no.");
            String answer = in.nextLine();
            if( answer.equalsIgnoreCase("yes")){
                askAdd();
                continue;
            } else {
	            if(answer.equalsIgnoreCase("no")){
	                System.out.println("quitting section ");
	                isTrue = false;
	            } 
	            else{
	                System.out.println("bad input");
	                break;
	            }       
            }
        }
    }

    public static void askAdd(){
        System.out.println("Enter name of the item you would like to purchase, as well as the price and quantity.");

        String itemName = in.next();
        double itemPrice = in.nextDouble();
        int itemQuantity = in.nextInt();
        in.nextLine();

        Item1 item = new Item1(itemName, itemPrice, itemQuantity);
        sc.addItem(item);

    }

    public static void askRemove(){
        in.nextLine();
        System.out.println("Would you like to remove an item? Enter item name or no.");
        String itemName = in.nextLine();
        boolean hasItem = false;
        if(itemName.equals("no")){
            System.out.println("quitting section ");
            return;
        }
        for(int i = 0 ; i < sc.getNumOfItems() ; i++){
            if(sc.getCartItems().get(i).getName().equals(itemName)){
                sc.removeItem( sc.getCartItems().get(i) );
                System.out.println(itemName + " was removed");
                hasItem = true;
            }
        }
        if(hasItem = false){
            System.out.println("invalid item name");
        }
    }

    
}