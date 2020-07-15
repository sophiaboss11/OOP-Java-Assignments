import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
/*
reads input and outputs interest and prints details
terminate program when the end of the file is reached 
*/
/*      
concepts:   1. input ouput, enter file name + intro output
           2. if statements calculating interest rates
           3. determine codes, calculate with formula
likely exception handling? terminate file when end is reached
            sample input:              Joseph Kardian III
                                       1500  4  a
enter name, amount of money on deposit and a number of years it has been on deposit
while input is valid
   */
public class main{
   public static Scanner scnr = new Scanner(System.in);
   public static void main(String[] args)throws IOException{
      //print intro
      System.out.println("              Program Number 1\n              Sophia Boss\n              Computer Science 3");
      ////////////////////////////////////////////////////////////////////
      //vars
      
      ArrayList<String> namesArray = new ArrayList<String>() ; 
      ArrayList<Double> moneyArray = new ArrayList<Double>(); 
      ArrayList<Integer> yearsArray = new ArrayList<Integer>(); 
      ArrayList<String> codeLetterArray = new ArrayList<String>() ; 
      //populate arrays
     readFile(namesArray, moneyArray, yearsArray, codeLetterArray);
     //test methods
      System.out.println(Arrays.toString(namesArray.toArray())); 

      System.out.println("\nP= " + moneyArray.get(1) + "\nr = " + getInterestRate( yearsArray.get(1) ) + "\nt = " + yearsArray.get(1));
      System.out.println("n = " +getTimesCalculated(codeLetterArray.get(1)));

      System.out.println( getInterest( moneyArray.get(1) , getInterestRate(yearsArray.get(1)), getTimesCalculated(codeLetterArray.get(1)), yearsArray.get(1) )+"\n");


      int i = 0;
      while(i < namesArray.size() ){
         System.out.printf("%-20s%-20f%-20.2f%$-20d%n", namesArray.get(i), moneyArray.get(i), getTimesCalculated(codeLetterArray.get(i)) , getInterestRate(yearsArray.get(1)) );
         i++;
      }

// pathname    /Users/sophia/Desktop/phil_and_CS/Assignment_1/assign1CS3.txt
// /Users/sophia/Desktop/phil_and_CS/Assignment_1/temp.txt
   }

   public static Scanner openFile()throws IOException{

      FileReader fileReader = null;
      String fileName;
      Scanner inSS;
      File  input;
      System.out.print("Enter a valid file name: ");

     //read in file
      fileName = scnr.nextLine();
      input = new File(fileName);

      //check if empty file
      if(!input.exists()){
         System.out.println("There was no data in the file.  Program terminated.\n");
         System.exit(0);
      }
      try{
         inSS = new Scanner(input);
         return inSS;
      }
      catch(IOException e){
            System.out.println("Could not attach file.  Program terminated.\n"+e +"\n\n");
            System.exit(0);
      }
      return null ;
   }

   public static int readFile(ArrayList<String> name, ArrayList<Double> money, ArrayList<Integer> years, ArrayList<String> codeLetter)throws IOException{
      int i = 0;
      Scanner inSS = openFile();
      while(inSS.hasNext()){
         name.add( inSS.nextLine() ) ;
         money.add( inSS.nextDouble() ) ;
         years.add( inSS.nextInt() ) ;
         codeLetter.add( inSS.next() );
         i++;
         if(!inSS.hasNext()){
            System.out.println("\n array full \n");
            break;
         }
         inSS.nextLine();
      }
      return i;
   }

  public static double getInterestRate( int numYears ){
      if(numYears >= 5){
         return 4.5;
      }
      if(numYears < 5 && numYears >= 4){
         return 4;
      }
      if(numYears < 4 && numYears >= 3){
         return 3.5;
      }
      if(numYears < 3 && numYears >= 2){
         return 2.5;
      }
      if(numYears < 2 && numYears >= 1){
         return 2;
      }
      if(numYears < 1){
         return 1.5;
      }
      else{
         return -1.0;
      }

  }

  public static int getTimesCalculated(String codeLetter){
      if( codeLetter.toLowerCase().contains("A".toLowerCase()) ){
         return 4;
      }
      if( codeLetter.toLowerCase().contains("B".toLowerCase()) ){
         return 2;
      }
      if( codeLetter.toLowerCase().contains("C".toLowerCase()) ){
         return 1;
      }
      if( codeLetter.toLowerCase().contains("D".toLowerCase()) ){
         return 12;
      }
      if( codeLetter.toLowerCase().contains("E".toLowerCase()) ){
         return 365;
      }
      else{
         return -1;
      }
  }

  public static double getInterest(double p , double r, int n, int t){

   r = r/100;
   double x = p * (1+r/n) ;
   double y = n * t ;
   double interest = Math.pow(x, y );
      return interest;

  }


}