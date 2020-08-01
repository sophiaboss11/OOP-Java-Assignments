import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
         monthInt = 00;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the one
      //       in the correct format, and output in m/d/yyyy format
        while(scnr.hasNextLine()){
            String month = scnr.next();
            String day = scnr.next();
            int day2;
            if(day.contains(",")){
                day2 = Integer.valueOf( day.substring(0, day.indexOf(",") - 1 ) );
            }else{
                day2 = Integer.valueOf(day);
            }
            
            int year = scnr.nextInt();
      
            System.out.println( getMonthAsInt(month) + "/" + day2 + "/" + year);
        }


     
   }
}
