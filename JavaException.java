import java.util.Scanner;
public class JavaException{ 
    public static Scanner KB = new Scanner(System.in);
    public static void main(String args[]) {
        int num1, num2;
        try {
         /* We suspect that this block of statement can throw 
          * exception so we handled it by placing these statements
          * inside try and handled the exception in catch block
          */
         
            num1 = KB.nextInt();
            num2 = 62 / num1;
            System.out.println(num2);
            if(num1 < 0)
                throw new Exception("Square root of negative nnumber is not defined");
            System.out.println(Math.sqrt(num1));

            System.out.println("Hey I'm at the end of try block");
        }
        catch (ArithmeticException e) { 
         //* This block will only execute if any Arithmetic exception 
         // * occurs in try block
          
            System.out.println("You should not divide a number by zero\n\n"+e);
      }
        catch (Exception e) {
         //* This is a generic Exception handler which means it can handle
         // * all the exceptions. This will execute if the exception is not
         // * handled by previous catch blocks.
         System.out.println("Exception occurred\n\n" + e);
      }finally{
            System.out.println("The code completed execution of try block.\n");
        }
        
     System.out.println("I'm out of try-catch block in Java.");
   }
}