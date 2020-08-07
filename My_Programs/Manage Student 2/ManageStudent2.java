import java.io.IOException;

/*
readData()

main()

/Users/sophia/Documents/GitHub/CSCI_3_Assignments/My_Programs/Manage Student 2/studentinput.txt
*/
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ManageStudent2{
public static ArrayList<String> data = new ArrayList<String>();
    public static void main(String args[])throws IOException{
        readData();
        
        Student2 myStudent = new Student2();
        myStudent.readCourses(data);

    }

    public static void readData()throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid file name: ");
        String fileName = sc.nextLine();

        try{
            File newFile = new File(fileName);
            if(!newFile.exists()){
                System.out.println("File does not exist, exiting... ");
                System.exit(0);
            }
            Scanner inSS = new Scanner(newFile);
            if(!inSS.hasNext()){
                System.out.println("no data in file, exiting");
                System.exit(0);
            }

            //read data into array
            while(inSS.hasNext()){
                data.add(inSS.nextLine());
            }
            //System.out.println(Arrays.toString(data.toArray()));

        }
        catch(Exception e){
            System.out.println("IO errors, exiting... ");
        }

    }

    public static ArrayList<String> getData(){
        return data;
    }
    
}

