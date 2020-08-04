import java.util.Scanner;

public class GoShopping{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Boolean isTrue = true;
        System.out.println("Enter your name and the date");

        ShoppingCart1 sc = new ShoppingCart1();

        try {
            sc.setName(in.next());
            sc.setDate(in.next());
            System.out.print("Name and date added. ");

            while(isTrue){
                System.out.println("Enter name of item, price and quantity.");

                String itemName = in.next();
                double itemPrice = in.nextDouble();
                int itemQuantity = in.nextInt();
    
                Item1 item = new Item1(itemName, itemPrice, itemQuantity);
                sc.addItem(item);

                System.out.println("would you like to add another item? Answer yes or no.");
                if(in.next().equalsIgnoreCase("yes")){
                    continue;
                }
                else if(in.next().equalsIgnoreCase("no")){
                    sc.printBill();
                    isTrue = false;
                    break;
                } 
                else{
                    System.out.println("wrong input");
                    isTrue = false;
                    break;
                }       
            }

        }
        catch(Exception e){
            System.out.println("invalid input");
            System.exit(0);
        }
        
        in.close();

    }
    
}