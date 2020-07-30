/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;
import java.util.Scanner;
/**
 *
 * @author useradmin
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        Car     myCar = new Car();
        Engine  e  ;
        Dealer d1 = new  Dealer(3);
		
        System.out.println( myCar);
        myCar.setType("2.0 L 4 Cylinders");
        myCar.setModel("Sedan");
        System.out.println("\n\n"+ myCar);
        e = myCar.getEngine();
        System.out.println("\n"+e);
        Read(myCar);
        System.out.println("\n\n"+ myCar);
        ReadList(d1);
        for (int i = 0 ; i < d1.getSize();i++)
            System.out.println(d1.getCar(i));
    }
    public static void Read (Car T){
        String  Temp ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        Temp = in.nextLine();
        T.setModel(Temp);
        System.out.print("Enter Car Make: ");
        Temp = in.nextLine();
        T.setMake(Temp);
        System.out.print("Enter Car Manufacturer: ");
        Temp = in.nextLine();
        T.setManufacturer(Temp);
        System.out.print("Enter Car Engine Type: ");
        Temp = in.nextLine(); 
        T.setType(Temp);
    }
    public static void ReadList(Dealer T){
        for (int i = 0 ; i < T.getCapacity(); i++)
        {
            Car Temp = new Car();
            Read(Temp);
            T.setCar(Temp);
        }
    }
}