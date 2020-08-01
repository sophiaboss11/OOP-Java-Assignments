import java.util.Scanner;
import java.util.ArrayList;

public class DataVisualizer {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      /* 
     	1. scanner one, scanner two
		2. scan data points, must be "string, int"
		3. store string with comma removed, atore int
		4. this is while input != -1
		5. store in arraylist of strings
		6.error checking> no comma, too many commas, if entry after comma not an int
      */
/*

*/
		//(1) Prompt the user for a title for data. Output the title. (1 pt)
		String title = "";
		System.out.println("Enter a title for the data:");
		title = scnr.nextLine();
		System.out.println("You entered: " + title);

		//(2) Prompt the user for the headers of two columns of a table. Output the column headers. (1 pt)

		String col1 = "";
		String col2 = "";
		System.out.println("Enter the column 1 header:");
		col1 = scnr.nextLine();
		System.out.println("You entered: " + col1);
		System.out.println("Enter the column 2 header:");
		col2 = scnr.nextLine();
		System.out.println("You entered: " + col2);

		//(3) Prompt the user for data points. Parse the data. check for errors

      Scanner inSS = null;
	  ArrayList<String> list = new ArrayList<String>();
	  //String s = "";
	  //int i;
	  String line = "";

		while( !(line.equals("-1")) ){
			System.out.println("Enter a data point (-1 to stop input):");
			line = scnr.nextLine();
			inSS = new Scanner(line);

			String s = inSS.substring( 0 , (inSS.indexOf(",")-1) );
			int i = inSS.substring(Integer.parseInt(  inSS.indexOf(",")+1 , inSS.length()  ) );

			System.out.println("Data string: " + s + "\n" + "Data integer: " + i);

		}


		//(5) Output the information in a formatted table.

		//(6) Output the information as a formatted histogram. 



   }
}
