import java.util.Scanner;
import java.io.*;
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
      //final int SIZE = 4;
      int fileLength = 5;
      
      String[] namesArray = new String[fileLength] ; // needs size
      double[] moneyArray = new double[fileLength];
      int[] yearsArray = new int[fileLength];
      String[] codeLetterArray = new String[fileLength];

     readFile(namesArray, moneyArray, yearsArray, codeLetterArray);
      System.out.print(Arrays.toString(yearsArray));


      
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
      System.out.print("you entered "+ fileName +"\n");
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

   public static int readFile(String []name, double[] money, int[] years, String[] codeLetter)throws IOException{
      int i = 0;
      Scanner inSS = openFile();
      while(inSS.hasNext()){
         name[i] = inSS.nextLine();
         money[i] = inSS.nextDouble();
         years[i] = inSS.nextInt();
         codeLetter[i] = inSS.next();
         i++;
         if(!inSS.hasNext()){
            System.out.println("\n array full \n");
            break;
         }
         inSS.nextLine();
      }
      return i;
   }
      /*
   public static int getLength()throws IOException{
      Scanner in = openFile();
      int length = 0;
      while(in.hasNextDouble()){
         length++;
      }
      return length;
   }
*/


   

}