import java.util.Scanner; 
import java.io.*;
import java.util.Arrays;

public class LabProgram{
   public static Scanner in = new Scanner(System.in);
   /* Define your method here */
   public static void exactChange(int change, int[] cVals){
   		int count = 0;
   		//int[] cVals = new int[5];		
   		
   		try{
	   		if(change<=0){
	   			System.out.println("no change");
	   		}
	   		if(change/100 > 0){
	   			count = change/100;
	   			if(count > 1){
	   				System.out.println(count + " dollars");
	   			}else{
	   				System.out.println(count + " dollar");
	   			}
	   			cVals[0]= count;
	   			change = change%100;
	   			count = 0;
	   		}
	   		
	   		if(change/25 > 0){
	   			count = change/25;
	   			if(count > 1){
	   				System.out.println(count + " quarters");
	   			}else{
	   				System.out.println(count + " quarter");
	   			}
	   			cVals[1]= count;
	   			change = change%25;
	   			count = 0;
	   		}
	   		//System.out.println(count + " > " + change);
	   		if(change/10 > 0){
	   			count = change/10;
	   			if(count > 1){
	   				System.out.println(count + " dimes");
	   			}else{
	   				System.out.println(count + " dime");
	   			}
	   			cVals[2]= count;
	   			change = change%10;
	   			count = 0;
	   		}
	   		if(change/5 > 0){
	   			count = change/5;
	   			if(count > 1){
	   				System.out.println(count + " nickels");
	   			}else{
	   				System.out.println(count + " nickel");
	   			}
	   			cVals[3]= count;
	   			change = change%5;
	   			count = 0;
	   		}
	   		if(change/1 > 0){
	   			count = change/1;
	   			if(count > 1){
	   				System.out.println(count + " pennies");
	   			}else{
	   				System.out.println(count + " penny");
	   			}
	   			cVals[4]= count;
	   			change = change%1;
	   			count = 0;
	   		}
	   		//System.out.println(Arrays.toString(cVals));
	   	}

	   	catch (Exception e){
	   		System.out.println("you can't do that");
	   	}
   }
   
   public static void main(String[] args)
   {
		/* Type your code here. */    
		int change;
		int[] coinVals = new int[5];
		int i = 0;

		try
		{
			change = in.nextInt();

		while(in.hasNextInt()){
		  	coinVals[i] = in.nextInt();
		  	System.out.print(coinVals[i]);
			}    

			exactChange(change, coinVals);  
			//exactChange(300, coinVals); 	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds");
		}
		catch( Exception e ){
				System.out.println("you can't do that");
		}

		//LabProgram lbp = new LabProgram();
		//System.out.println();

	}
}
