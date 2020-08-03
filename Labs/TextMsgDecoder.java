import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter text:");
      String input = scnr.nextLine();
      System.out.println("You entered: " + input);

      if(input.contains("LOL")){
      	System.out.println("LOL: laughing out loud");
      }     
      if(input.contains("BFF")){
            System.out.println("BFF: best friend forever");
      } 
      if(input.contains("IDK")){
      	System.out.println("IDK: I don't know");
      }
      if(input.contains("JK")){
      	System.out.println("JK: just kidding");
      }
      if(input.contains("TMI")){
      	System.out.println("TMI: too much information");
      }
     if(input.contains("TTYL")){
            System.out.println("TTYL: talk to you later");
      }
      // else{
      // 	System.out.println("Unknown");
      // }

   }
}
