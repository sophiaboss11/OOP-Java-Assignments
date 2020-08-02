/*
UML ManageStudent.java

Scanner in
String[] students

main()
readData()

*/
// /Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5.txt
import java.io.*;
import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;

public class ManageStudent{

    //prompt user for file, read data into array of students
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[])throws IOException{
        
        System.out.println("enter valid file name: ");
        String fileName = in.nextLine();
        //read data into one array
            ArrayList<String> data = new ArrayList<String>();
            data = readData(fileName);

        /*//test getCourseList()
            String[] test1 = {" Smith Jr., Joe", "111-22-3333 3", "Physics I", "A 5", " English 1A", "B 4", " English 1B", "F 4"};
            
            x.getCourseList(test1);
            */
        
            //System.out.println(Arrays.toString(data.toArray()));
            Student x = new Student();
            x.readStudent(data);

        

    }

    public static ArrayList<String> readData(String fName)throws IOException{
        File input = new File(fName);
        Scanner inSS;
        
        ArrayList<String> list = new ArrayList<String>();
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
                list.add(inSS.nextLine());
                System.out.println("> " + list.get(i));
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