import java.util.Scanner; 
import java.util.Arrays;

public class LabProgram {
      public static Scanner in = new Scanner(System.in);
   /* Define your method here */
	public static boolean isArrayEven(int[] arrayValues, int arraySize){
		boolean isEven = true;
		boolean hasOdd = false;
		for(int i = 0 ; i < arraySize - 1; i++){
			if (arrayValues[i]%2 != 0){
				isEven = false;
			}
			else if(arrayValues[i]%2 == 0){
				hasOdd = true;
			}
		}
		if(hasOdd = true ){
			//System.out.println("not even or odd");

		}
		if(isEven = true){
			//System.out.println("all even");
		}
		return isEven;

	}
	public static boolean isArrayOdd(int[] arrayValues, int arraySize){
		boolean isOdd = true;
		boolean hasEven = false;
		for(int i = 0 ; i < arraySize - 1; i++){
			if (arrayValues[i]%2 != 0){
				isOdd = false;
			}
			else if(arrayValues[i]%2 == 0){
				hasEven = true;
			}
		}
		if(hasEven = true ){
			//System.out.println("not even or odd");

		}
	h	if(isOdd = true){
			//System.out.println("all odd");
		}
		return isOdd;
	}
   
   public static void main(String[] args) {
      int size = in.nextInt();
      int i=1;
      int[] arr = new int[size];
   	while(in.hasNextInt()){
   	     arr[i] = in.nextInt();
   	}
   	//System.out.println(size + " " + Arrays.toString(arr));

      boolean isGood = false;
      
      
      //check if we are even
    	isGood = isArrayEven(arr, size);
    	
    	//if even we are done
    	if(isGood == true)
    	{
         System.out.println("all even"); 	   
    	   
    	}else
    	{
    	   //check if we are odd
    	   isGood = isArrayOdd(arr, size);
    	   
    	   //if odd then done
    	   if(isGood == true)
    	   {
    	      System.out.println("all odd");
    	   }
    	   else
    	   {
    	      System.out.println("not even or odd");
    	   }
    	}
    	

   }
}
