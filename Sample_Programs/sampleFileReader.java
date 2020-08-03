import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class sample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        FileReader fileReader = null;
        String fileName;
        int charRead;
        charRead = 0;

        System.out.print("Enter a valid file name: ");
        fileName = scnr.next();

        try{
            System.out.println("Opening file " + fileName + ".");
            fileReader = new FileReader(fileName); 

            System.out.print("Reading character values: ");

            while (charRead != -1){
            charRead = fileReader.read();
            System.out.print(charRead + " ");
            } 
        }catch(IOException excpt){
            System.out.println("Caught IOException: "+ excpt.getMessage());
        }

    }

}