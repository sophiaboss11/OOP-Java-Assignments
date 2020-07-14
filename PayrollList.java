/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrolllist;

/**
 *
 * @author mghyam
 */
import java.util.Scanner;
import java.io.*;
public class PayrollList {

/*  Calculate salary for hourly paid list of employee
    input : name, hours, pay rate for a file see format
    output: name, hours, pay rate, net salray, taxes, gross salary 
            Table format in a file and monitor
    salary = hours * payRate  + over time
    tax = salary * TaxRate
    net = salary - taxes
    
    Input file organization:
    Full name
    hours pay_rate
    */   
    public static Scanner KB= new Scanner(System.in);
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        final int SIZE = 20;
        String []  empNames= new String [SIZE];
        double []   hours = new double[SIZE], payRate = new double[SIZE];
        int   empNumber;
        empNumber = readData(empNames, hours, payRate);
        
        
        System.out.println(calcGrossSal(20.0, 20.0));
        System.out.println(calcTax(400.0));

    }
    public static int readData(String []name, double[] hrs, double [] pay)throws IOException{
        /*
        Joe Smith Jr.
        56 45
        Nancy Brown
        34 23.9 
        */
        int     i = 0;
        Scanner  fin = openFile();
        while(fin.hasNext()){
            name[i] = fin.nextLine();
            hrs[i] = fin.nextDouble();
            pay[i] = fin.nextDouble();
            i++;
            if ( i == hrs.length){  // if (fin.hasNext())
                System.out.println("Array is full, data left in the file.\n");
                break ;
            }
            fin.nextLine(); // Clean up the buffer where there is a \n
        }
        return i ;
    }
    public static Scanner openFile()throws IOException{
        String  fileName;
        Scanner fin;
        File    input;
        System.out.println("Enter input File name: ");
        
        fileName = KB.nextLine();
        input = new File(fileName);
        if(!input.exists()){
            System.out.println("Bad file name.  Exit program.\n");
            System.exit(0);
        }
        try{
            fin = new Scanner(input);
            return fin;
        }
        catch(IOException e){
            System.out.println("Could not attache file.  Exit program.\n"+e +"\n\n");
            System.exit(0);
        }
        return null ;
    }
    public static double calcGrossSal(double hrs, double wages){
        double gross;
        if(hrs > 40)
            gross = (hrs - 40)* 1.5 * wages + (40 * wages);
        else
            gross = hrs * wages;
        return gross;
    }
    
    public static double calcTax(double gross){
        double taxRate;
        if( gross < 1000)
            taxRate = 0;
        else if(gross < 2000)
            taxRate = 2;
        else if (gross < 4000)
            taxRate = 5 ;
        else if (gross < 10000)
            taxRate = 8;
        else 
            taxRate = 12 ;
        return taxRate;
    }
}
/*
 String  empName, fileName;
        double  payRate, hours, net, gross, taxes, taxRate;
        final int TAXRATE = 8;
       
        Scanner   fileIn;
        File      input;
        File fileWriter = new File("e:\\out11.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.print("Enter File name: ");
        fileName = KB.nextLine();
        input = new File(fileName);
        fileIn = new Scanner(input);
        if (!fileIn.hasNext())
           System.out.println("\n** No data found in the file.**\n");
        while( fileIn.hasNext()){
            empName = fileIn.nextLine();
            if( empName.length()==0){
                System.out.println("Name must have some charaters. The program terminates.");
                return ;
            }

            hours = fileIn.nextDouble();
            if(hours < 0 || hours > 60){
                System.out.println("Hours must be between 0 and 60. The program terminates.");
               return;
            }

            payRate = fileIn.nextDouble();
            if (payRate < 0 || payRate > 200){
                System.out.println("Pay rate must be between 0 and $200. The program terminates.");
                return ;
            }
            if(hours > 40){
                System.out.println("Adding over time.");
                gross = 40 * payRate +(hours -40)*1.5*payRate;
            }
            else{
                gross = hours * payRate ;
            }
            if( gross < 1000)
                taxRate = 0;
            else if(gross < 2000)
                taxRate = 2;
            else if (gross < 4000)
                taxRate = 5 ;
            else if (gross < 10000)
                taxRate = 8;
            else 
                taxRate = 12 ;

            taxes = gross * taxRate /100 ;
            net = gross - taxes ;

            System.out.println("\n\n\t\tEmployee Payroll Report\n");
            System.out.printf("%-35s%s\n","Employee name:" , empName);
            System.out.printf("%-35s%.2f\n","Employee hours worked:", hours);
            System.out.printf("%-35s%s%.2f\n","Employee pay rate:","$", payRate);
            System.out.printf("%-35s%.2f%s\n","Employee Tax Rate:",taxRate,"%");

            System.out.println("Employee Net Salary:       $" + net);
            System.out.printf("%-35s%s%.2f\n","Employee Taxes owed:","$",taxes);
            System.out.printf("%-35s%s%.2f\n","Employee Gross salary:","$", gross);
            System.out.printf("%-35s%s%.2f\n","Employee Net Salary:","$" , net);

            printWriter.println("\n\n\t\tEmployee Payroll Report\n");

            printWriter.printf("%-35s%s\n","Employee name:" , empName);
            printWriter.printf("%-35s%.2f\n","Employee hours worked:", hours);
            printWriter.printf("%-35s%s%.2f\n","Employee pay rate:","$", payRate);
            printWriter.printf("%-35s%.2f%s\n","Employee Tax Rate:",taxRate,"%");

            printWriter.printf("%-35s%s%.2f\n","Employee Taxes owed:","$",taxes);
            printWriter.printf("%-35s%s%.2f\n","Employee Gross salary:","$", gross);
            printWriter.printf("%-35s%s%.2f\n","Employee Net Salary:","$" , net);
            fileIn.nextLine();
        }            
        printWriter.close();

        
        System.out.println("\n\n\t\tEmployee Payroll Report\n");
        System.out.println("Employee name:             " + empName);
        System.out.println("Employee hours worked:     " + hours);
        System.out.println("Employee pay rate:         $"+ payRate);
        System.out.println("Employee Taxes owed:       $"+taxes);
        System.out.println("Employee Gross salary:     $"+ gross);
        System.out.println("Employee Net Salary:       $" + net);
        
*/