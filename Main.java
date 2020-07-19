import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class main{
   public static Scanner scnr = new Scanner(System.in);
   public static void main(String[] args)throws IOException{
      //print title
      System.out.println("              Program Number 1\n              Sophia Boss\n              Computer Science 3");
      //vars
      ArrayList<String> namesArray = new ArrayList<String>(); 
      ArrayList<Double> moneyArray = new ArrayList<Double>(); 
      ArrayList<Double> yearsArray = new ArrayList<Double>(); 
      ArrayList<String> codeLetterArray = new ArrayList<String>(); 
      
      //populate arrays
      readFile(namesArray, moneyArray, yearsArray, codeLetterArray);

      // print values in a chart
      System.out.println("Name                Years  Deposit       Interest Earned         Total");
      int i = 0;
      while(i < namesArray.size() ){
         double compoundInterest = getInterest( moneyArray.get(i) , getInterestRate(yearsArray.get(i)), getTimesCalculated(codeLetterArray.get(i)), yearsArray.get(i) );
         double interest = compoundInterest - moneyArray.get(i) ; 
         System.out.printf("%-20s%-7.2f$%-17.2f$%-19.2f$%-16.2f%n", namesArray.get(i), yearsArray.get(i), moneyArray.get(i), interest, compoundInterest );
         i++;
      }
   }

   public static Scanner openFile()throws IOException{

      FileReader fileReader = null;
      String fileName;
      Scanner inSS;
      File  input;
      System.out.println("Enter a valid file name: ");

     //read in file
      fileName = scnr.nextLine();
      input = new File(fileName);
     
      //check if file exists
      if(!input.exists()){
         System.out.println("Could not open file.  Program terminated.");
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

   public static int readFile(ArrayList<String> name, ArrayList<Double> money, ArrayList<Double> years, ArrayList<String> codeLetter)throws IOException{    
     	
     	int i = 0;
      Scanner inSS = openFile();

      //check if empty file 
     	if(!inSS.hasNext()){
      	System.out.println("There was no data in the file.  Program terminated.");
        System.exit(0);
      }
     //populate ArrayLists
      while(inSS.hasNext()){
         name.add( inSS.nextLine() ) ;
         money.add( inSS.nextDouble() ) ;
         years.add( inSS.nextDouble() ) ;
         codeLetter.add( inSS.next() );
         i++;
         if(!inSS.hasNext()){
            //System.out.println("\n array full \n");
            break;
         }
         inSS.nextLine();
      }
      return i;
   }

  public static double getInterestRate( double numYears ){
      if(numYears >= 5){
         return 0.045;
      }
      if(numYears < 5 && numYears >= 4){
         return 0.04;
      }
      if(numYears < 4 && numYears >= 3){
         return 0.035;
      }
      if(numYears < 3 && numYears >= 2){
         return 0.025;
      }
      if(numYears < 2 && numYears >= 1){
         return 0.02;
      }
      if(numYears < 1){
         return 0.015;
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

  public static double getInterest(double principalAmount , double annualInterestRate, int numTimesCompounded, double numYears){
      // A = P(1+ r/n)^nt
      double interest =  principalAmount * Math.pow((1 + annualInterestRate / numTimesCompounded) , numTimesCompounded * numYears );
      return interest;
  }


}
