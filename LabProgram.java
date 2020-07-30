



import java.util.Scanner; 

public class LabProgram {
   public static Scanner in = new Scanner(System.in);

   		public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize){

   			//String input = in.nextLine();
   			return input.substring(input.indexOf(contactName),input.indexOf(contactName)+9);
   		}   
   
   public static void main(String[] args) {
      /* Type your code here. */
      	int arraySize = in.nextInt();
      	  String[] nameVec = new String[arraySize];
	      String[] phoneNumberVec = new String[arraySize];
	      
	   
	for(int i = 0 ; i < arraySize ; i++){
		phoneNumberVec[i]= in.nextInt();
		nameVec[i] = next();
	}

	String contactName = in.nextLine();


      System.out.println(""+ getPhoneNumber(nameVec, phoneNumberVec, contactName, arraySize));
   }
}
