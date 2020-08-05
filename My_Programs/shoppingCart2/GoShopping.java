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

            while(isTrue){
                System.out.println("would you like to add or remove item? Answer add, remove or no.");
                String answer = in.next();
                if(answer.equalsIgnoreCase("add")){
                    askAdd();
                    continue;
                }
                if(answer.equalsIgnoreCase("remove")){
                    askRemove();
                    continue;
                } 
                if(answer.equalsIgnoreCase("no")){
                    break;
                } 
                else{
                    System.out.println("bad input");
                    break;
                }       
            }
            //in.close();

            System.out.println("-- Thank you for shopping -- ");
            sc.printBill();
        }
        catch(Exception e){
            System.out.println("invalid input");
            System.exit(0);
        }
        in.close();

    }

    public static void askAdd(){
        System.out.println("Enter name of the item you would like to purchase, as well as the price and quantity.");

        String itemName = in.next();
        double itemPrice = in.nextDouble();
        int itemQuantity = in.nextInt();

        Item1 item = new Item1(itemName, itemPrice, itemQuantity);
        sc.addItem(item);

    }

    public static void askRemove(){
        //Scanner scnr = new Scanner(System.in);
        while(isTrue){
            // System.out.println("Would you like to remove an item? Answer y or n.");
            // String answer2 = in.next();
            // if(answer2.equalsIgnoreCase("y")){
                System.out.println("What is the name of the item you would like to remove?");
                String itemName = in.nextLine();
                for(int i = 0 ; i < sc.getNumOfItems() ; i++){
                    if(sc.getCartItems().get(i).getName().equals(itemName)){
                        sc.removeItem( sc.getCartItems().get(i) );
                        System.out.println(itemName + " was removed");
                    }
                    else{
                        System.out.println("invalid item name, try again");
                        continue;
                    }
                }
                in.close();

            // }
            // if(answer2.equalsIgnoreCase("n")){
            //     break;
            // } 
            // else{
            //     System.out.println("bad input");
            //    // isTrue = false;
            //     break;
            // } 
        }
    }

    
}