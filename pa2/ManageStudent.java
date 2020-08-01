/*
UML ManageStudent.java

Scanner in
String[] students

main()
readData()

*/
import java.io.*;
import java.util.Scanner;
public class ManageStudent{

    //prompt user for file, read data into array of students
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[])throws IOException{
        
        System.out.println("enter valid file name: ");
        String fileName = in.nextLine();
        String[] data = new String[20];
        data = readData(fileName);
        

    }

    public static String[] readData(String fName)throws IOException{
        File input = new File(fName);
        Scanner inSS;
        
        String[] list = new String[20];
        int i = 0;

        if(!input.exists()){
            System.out.println("file does not exist, exiting");
            System.exit(0);
        }
        try{
            inSS = new Scanner(input);
            //return inSS-- come back here
            //check if empty
            if(!inSS.hasNext()){
                System.out.println("no data in file, exiting");
                System.exit(0);
            }

            //populate arrays
            while(inSS.hasNext()){
                list[i] = inSS.nextLine();
                System.out.println("> " + list[i]);
                i++;
            }

        }
        catch(IOException e){
            System.out.println("Could not attatch file, exiting");
            System.exit(0);
        }
        return list;

    }

    
}