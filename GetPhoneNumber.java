import java.util.Scanner; 
import java.util.Arrays;
public class LabProgram {
   public static Scanner in = new Scanner(System.in);

   		public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize){
   			
            for (int x = 0; x < arraySize ; x++) {
               if(nameVec[x].equals(contactName))
               {
                  return phoneNumberVec[x];
               }
            }
   			return "error";
   		}   
   


   public static void main(String[] args) {
      /* Type your code here. */
      
      int arraySize = in.nextInt();
      String[] stringArray = new String[arraySize * 2];
      
      for(int j = 0 ; j < arraySize * 2 ; j++){
         stringArray[j] = in.next();
      }

      System.out.println(Arrays.toString(stringArray));

      String[] nameVec = new String[20];
      String[] phoneNumberVec = new String[20];
      
      for (int i = 0; i < arraySize; i++) {
         nameVec[i] = stringArray[i*2];
         phoneNumberVec[i] = stringArray[i*2+1];
      }

      String contactName = in.next();

      // if(in.hasNextLine())
      // {
      //    contactName = in.nextLine();   
      // }
      // else
      // {
      //    contactName = stringArray[arraySize - 1];
      //    //arraySize -=1;
      // }


      String result = getPhoneNumber(nameVec, phoneNumberVec, contactName, arraySize);
      
      System.out.println(""+result);
   }
}
