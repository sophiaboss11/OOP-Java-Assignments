/*
|-----------------------------------
|           Item 
|-----------------------------------
| - itemName        :  String 
| - itemPrice       :  double  
| - itemQuantity    :  int 
|------------------------------------   
|   Item()
|   Item(String name, double price, int quantity)
|   Item(Item obj)
| + public setName(String name):void
| + public setPrice(double price):void
| + public setQuantity(int quantity):void
| + public getName():String
| + public getPrice():double
| + public getQuantity():int
| + public printInfo():void
| + public toString():String  
| + public printItemCost():void
|-----------------------------------
*/

public class Item1 {
    private String itemName ;
    private double itemPrice ;
    private int itemQuantity ;
   
    Item1(){}
    Item1(String name, double price, int quantity) {
        setName (name);
        setPrice(price) ;
        setQuantity (quantity) ;
    }
    Item1(Item1 obj) {
        setName (obj.getName());
        setPrice(obj.getPrice()) ;
        setQuantity (obj.getQuantity()) ;
   }
   public void setName(String name) {
        if(name != null )
            itemName = name;
   }
   public void setPrice(double price) {
        if(price > 0 )
           itemPrice = price;
   }
   
   public void setQuantity(int quantity) {
        if(quantity > 0)
            itemQuantity = quantity;
   }
   public String getName() {
      return itemName;
   }
   public double getPrice() {
        return itemPrice;
   }
   public int getQuantity() {
        return itemQuantity;
   }
   public void printInfo(){
        System.out.println(itemName + "    "+itemQuantity +" @$" + 
               String.format("%.2f",itemPrice )+ " = $" + 
               String.format("%.2f",itemPrice * itemQuantity));
   }
   public String toString() {
        return(itemQuantity + " " + itemName + "@$" + 
              String.format("%.2f",itemPrice ) +  " = $" + 
              String.format("%.2f",itemPrice * itemQuantity));
   }
   
   public void printItemCost() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + 
                        (itemPrice * itemQuantity));
   }
}
