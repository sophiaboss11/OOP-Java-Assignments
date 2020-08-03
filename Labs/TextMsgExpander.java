import java.util.Scanner;

public class TextMsgExpander {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter text:");
      String input = scnr.nextLine();
      System.out.println("You entered: " + input + "\n");

      if(input.contains("LOL")){
         input = input.replace("LOL", "laughing out loud");
      	System.out.println("Replaced \"LOL\" with \"laughing out loud\".");
      }     
      if(input.contains("IDK")){
         input = input.replace("IDK", "I don't know");
         System.out.println("Replaced \"IDK\" with \"I don't know\".");
      }
      if(input.contains("JK")){
         input = input.replace("JK", "just kidding");
         System.out.println("Replaced \"JK\" with \"just kidding\".");
      }      
      if(input.contains("TMI")){
         input = input.replace("TMI", "too much information");
         System.out.println("Replaced \"TMI\" with \"too much information\".");
      }
      if(input.contains("TTYL")){
         input = input.replace("TTYL", "talk to you later");
         System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
      }      
      if(input.contains("BFF")){
         input = input.replace("BFF", "best friend forever");
         System.out.println("Replaced \"BFF\" with \"best friend forever\".");
      }

      System.out.println("\n" + "Expanded: " + input);
   }
}
