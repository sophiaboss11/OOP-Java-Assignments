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
import java.util.Arrays;
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
        double []  netSal , taxes = null;
        int   empNumber;
        empNumber = readData(empNames, hours, payRate);
        empNames= trimArray(empNames, empNumber);
        payRate = trimArray(payRate,empNumber);
        hours = trimArray(hours,empNumber);

        System.out.println(Arrays.toString(empNames));
        System.out.println(Arrays.toString(payRate));
        System.out.println(Arrays.toString(hours));

        if( empNumber >0){
            netSal = calcSalList(hours,payRate,empNumber);
            taxes = calcTaxList(netSal,empNumber);
            printTable(empNames,taxes,netSal,empNumber);
        }
        else
            System.out.println("Data file was blank.\n");        
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
    public static double[] calcSalList(double []hrs, double [] pay, int size){
        double [] sal = new double[hrs.length];
        for (int i = 0 ; i < size; i++)
            sal[i] = calcGrossSal(hrs[i], pay[i]);
        return sal ;
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
    public static double[] calcTaxList(double []sal, int size){
        double [] tax = new double[sal.length];
        for (int i = 0 ; i < size; i++)
            tax[i] = calcTax(sal[i]);
        return tax ;
    }
    public static void printReport(String empName, double hours, double payRate,
            double taxRate,double taxes, double gross, double net){
        
        System.out.println("\n\n\t\tEmployee Payroll Report\n");
        System.out.printf("%-35s%s\n","Employee name:" , empName);
        System.out.printf("%-35s%.2f\n","Employee hours worked:", hours);
        System.out.printf("%-35s%s%.2f\n","Employee pay rate:","$", payRate);
        System.out.printf("%-35s%.2f%s\n","Employee Tax Rate:",taxRate,"%");
        
        System.out.printf("%-35s%s%.2f\n","Employee Taxes owed:","$",taxes);
        System.out.printf("%-35s%s%.2f\n","Employee Gross salary:","$", gross);
        System.out.printf("%-35s%s%.2f\n","Employee Net Salary:","$" , net);
        
    } 
    public static void printTable(String []empName, 
            double taxes[], double[] gross, int size){
        
        System.out.println("\n\n\t\tEmployee Payroll Report\n");
        System.out.printf("%-20s%-10s%-10s%-10s\n",
                "Name", "Gross Sal","Taxes","Net Sal");
        for (int i = 0 ; i < size; i++)
            System.out.printf("%-20s%-10.2f%-10.2f%-10.2f\n",
                empName[i], gross[i],taxes[i], gross[i] - taxes[i]);
    } 
    public static double[] trimArray(double[] arr, int newSize) {   
        double[] trimmed = new double[newSize ]; 
        for (int i = 0; i < trimmed.length; i++) 
            trimmed[i] = arr[i]; 
        // return the new trimmed array 
        return trimmed; 
    }   
    public static String[] trimArray(String[] arr, int newSize) {   
        String[] trimmed = new String[newSize ]; 
        for (int i = 0; i < trimmed.length; i++) 
            trimmed[i] = arr[i]; 
        // return the new trimmed array 
        return trimmed; 
    } 
}
