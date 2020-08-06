/*
UML ManageStudent.java

Scanner in
String[] students

main()
readData()

*/
// /Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5.txt
// /Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5 2.txt
// D:\Documents D\CSCI_3_Assignments\pa2\lab5 2.txt
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class ManageStudent{
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[])throws IOException{
        System.out.println("              Program Number 2\n              Sophia Boss\n              Computer Science 3");

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> ids = new ArrayList<String>();
        ArrayList<Integer> unitsTaken = new ArrayList<Integer>();
        ArrayList<Integer> unitsCompleted = new ArrayList<Integer>();
        ArrayList<Double> averages = new ArrayList<Double>();
    
        System.out.println("enter valid file name: ");
        String fileName = in.nextLine();
        //read data into one array
            ArrayList<String> data = readData(fileName);
        //create array of students
            Student x = new Student();
            Student[] studentArray = x.readStudent(data);
           // System.out.println("student array: " + studentArray );

        //test process calculations
             x.processCalculations(studentArray);
             unitsTaken = x.getTotalUnitsArr();
             unitsCompleted = x.getCompletedUnitsArr();
             averages = x.getGpaArr();

        // print values in a chart
            System.out.println("\n\nName                Id                  Units Taken         Units Completed     Average");
            names = x.getNamesList();
            ids = x.getIdsList();
            int i = 0;
            while(i < names.size() ){
                System.out.printf("%-20s%-20s%-20d%-20d%-20.2f%n", names.get(i), ids.get(i), unitsTaken.get(i), unitsCompleted.get(i), averages.get(i) );
                i++;
            }
            System.out.println("Total number of Students: " + studentArray.length + "\n" + "Total Units completed by all students: " + )

    }

    //something in here that is off
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