//print rows and columns 
/*
Given numRows and numColumns, print a list of all seats in a theater. Rows are numbered, columns lettered, as in 1A or 3E. Print a space after each seat, including after the last. Use separate print statements to print the row and column. Ex: numRows = 2 and numColumns = 3 prints:
1A 1B 1C 2A 2B 2C 
*/
import java.util.Scanner;
public class NestedLoops {
   static Scanner scnr = new Scanner(System.in);
   public static void main (String [] args) {
      System.out.println("enter rows and columns:");
      int numRows;
      int numColumns;
      int currentRow;
      char currentColumnLetter;
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      final String ALPHABET = "ABCDEFGHIJKLMNOP"; 
   
      //System.out.println("enter rows and columns: ");
     
      if(numRows < 1 || numColumns < 1){
      System.out.println("enter number greater than 1");
      System.exit(0);
      }
      
      for(currentRow = 0 ; currentRow <= numRows -1 ; currentRow++){
         //System.out.print(currentRow);    
         for(currentColumnLetter = ALPHABET.charAt(0) ; currentColumnLetter <= ALPHABET.charAt(numColumns-1) ; currentColumnLetter ++){
            System.out.print(""+(currentRow+1) + currentColumnLetter + " ");
         }
      }

      System.out.println(" ");
      //scnr.close();
   }
}