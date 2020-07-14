import java.util.Scanner; 

public class middleValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      
      /* loop that scans values     outputs index of length/2 */
      int arrayLength = 0;
      
      //find length
      String s = scnr.nextLine();
      for(int j = 0 ; j <= s.length() - 1; j++){
         //char c = s.charAt(j);
         if(Character.isWhitespace(s.charAt(j))){
            arrayLength = arrayLength + 1;
         }
      }
      //System.out.print(arrayLength);
      
      //read data into array
      for(int i = 0 ; i < arrayLength ; ++i)
      {
         userValues[i] = scnr.nextInt();
      }       

      if(userValues.length <= 9){
         //print middle value
         System.out.print( userValues[ userValues.length / 2 ] );
         //break;
      }
      else{
         System.out.print("Too many inputs");
      }
      
   }
}
