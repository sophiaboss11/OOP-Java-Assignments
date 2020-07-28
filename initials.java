import java.util.Scanner; 
import java.io.*;


public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner in = new Scanner(System.in);
      //int count = 0;
      String first;
      String sec; 
      String thir; 
      String initial;
      
      // while(in.hasNext()){
      //    count++;  
      //    if(!in.hasNext()){
      //       break;
      //    }
      // }
      //if(count == 2){
         first = in.next();
         sec = in.next();  
         initial = first.substring(0,1);
      //}
      if(in.hasNext()){
         // first = in.next();
         // sec = in.next();
         thir = in.next();
         //initial = first.substring(0,1);
         String initial2 = sec.substring(1,2);
         System.out.println(thir + ", " + initial + "." + initial2 + ".");
      }   
      else if(in.hasNext()){
       System.out.println("invalid input");  
      }
      else{
         System.out.println(sec + ", " + initial + ".");

      }
      
   }
}

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int count = 0;
      String first;
      String sec; 
      String thir; 
      String initial;
      
      while(in.hasNext()){
         count++;  
         if(count > 4){
            break;
         }
      }
      count -=2;
      //System.out.println(count);
      
      if(count == 2){
         first = in.next();
         sec = in.next();  
         initial = first.substring(0,1);
         System.out.println(sec + ", " + initial + ".");
      }
      else if(count == 3){
         first = in.next();
         sec = in.next();
         thir = in.next();
         initial = first.substring(0,1);
         String initial2 = sec.substring(0,1);
         System.out.println(thir + ", " + initial + "." + initial2 + ".");
      }   
      else{
       System.out.println("invalid input");  
      }
      
   }
}
////////////

1 4      4     10
2 3      6     10

2 6      12    16
3 5      15    16

















