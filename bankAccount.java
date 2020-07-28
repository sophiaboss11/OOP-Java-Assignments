/*
public class bankAccount

calsBonus > 2%/year etc year calculated
annual interest compounded monthly
print()
getname
getaddress
getmoney
calcbonus
calcinterest
calctotal
*/

import java.util.Scanner;

public class bankAccount{
    private String name ="";
    private String address = "";
    private double money, bonus, interest, months;

    public void setName(String name){
        name = this.name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        address = this.address;
    }
    public String getAddress(){
        return address;
    }
    public void setMoney(double money){
        money = this.money;
    }
    public double getMoney(){
        return money;
    }
    public void setMonths(double months){
        months = this.months;
    }
    public double getMonths(){
        return months;
    }
    public double calcBonus(){
        double bonus = (getMonths() / 12) * 0.02;
        return bonus;
    }
    public double calcInterest(double rate){
        //prompt user for rate to use method
        //might need to call methods
        double r = rate / 100 ;
        double n = 12; //think this is right, compounded monthly?
        double t = getMonths() / 12; //may need to round down
        interest = getMoney() * Math.pow((1 + (r / n)), n * t);
        return interest ;
    }
    public double calcTotal(){

    }

}
public class testAcc{
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[]){
        bankAccount bank = new bankAccount();

        //get input
        System.out.println("enter name ");
        String name = in.nextLine();
        System.out.println("enter street of your address ");
        String street = in.nextLine();
        System.out.println("enter city of your address ");
        String city = in.nextLine();
        System.out.println("enter enter state of your address ");
        String state = in.nextLine();
        System.out.println("enter deposit amount ");
        double money = in.nextDouble();
        System.out.println("enter months of deposit ");
        double deposit = in.nextDouble();
        System.out.println("enter annual interest rate; ");
        double rate = in.nextDouble();

        bank.calcInterest(rate);
        //that's how far i got :^)

    }
}