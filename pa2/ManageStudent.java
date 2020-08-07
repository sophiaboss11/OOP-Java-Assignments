/*
--- UML ---
+ class ManageStudent

+ Scanner in
+ String[] students

+ main()
+ readData()

my file paths
/Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5.txt
/Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5 2.txt
D:\Documents D\CSCI_3_Assignments\pa2\lab5 2.txt

output path
/Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/studentOutputFile.txt

*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ManageStudent{
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[])throws IOException{
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> ids = new ArrayList<String>();
        ArrayList<Integer> unitsTaken = new ArrayList<Integer>();
        ArrayList<Integer> unitsCompleted = new ArrayList<Integer>();
        ArrayList<Double> averages = new ArrayList<Double>();
        ArrayList<String> lastNames = new ArrayList<String>();
        Course c = new Course();

        //print title
        System.out.println("\n              Program Number 2\n              Sophia Boss\n              Computer Science 3\n");
    
        //read data into array and create an array of students
        System.out.println("enter valid file name: ");
        String fileName = in.nextLine();
        ArrayList<String> data = readData(fileName);
        Student x = new Student();
        Student[] studentArray = x.readStudent(data);

        //**** output information    > had to comment out for zybooks submission
        // c.output(names, lastNames, ids, unitsTaken, unitsCompleted, averages, studentArray, x);
           
        // print information
        c.print(names, lastNames, ids, unitsTaken, unitsCompleted, averages, studentArray, x);

        
    }



    public static ArrayList<String> readData(String fName)throws IOException{
        File input = new File(fName);
        Scanner inSS;
        
        ArrayList<String> listOfData = new ArrayList<String>();

        if(!input.exists()){
            System.out.println("file does not exist, exiting");
            System.exit(0);
        }
        try{
            inSS = new Scanner(input);
            if(!inSS.hasNext()){
                System.out.println("no data in file, exiting");
                System.exit(0);
            }

            //populate arrays
            while(inSS.hasNext()){
                listOfData.add(inSS.nextLine());
            }

        }
        catch(IOException e){
            System.out.println("Could not attatch file, exiting");
            System.exit(0);
        }
        return listOfData;
    }



}