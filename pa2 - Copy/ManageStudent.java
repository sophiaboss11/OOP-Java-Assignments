/*
UML ManageStudent.java

Scanner in
String[] students

main()
readData()

*/
// /Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5.txt
// /Users/sophia/Documents/GitHub/CSCI_3_Assignments/pa2/lab5.2.txt
//  C:\Users\Sophia Boss\OneDrive - Sunset Radiology, Inc\Desktop\lab52.txt
// C:/Users/Sophia Boss/OneDrive - Sunset Radiology, Inc/Desktop/lab52.txt
// D:\Documents D\CSCI_3_Assignments\pa2 - Copy\lab5 2.txt
import java.io.*;
import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;

public class ManageStudent{
    public static Scanner in = new Scanner(System.in);
    public static void main(String args[])throws IOException{
        System.out.println("              Program Number 2\n              Sophia Boss\n              Computer Science 3");
        Student x = new Student();

/*
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> ids = new ArrayList<String>();
        ArrayList<Integer> unitsTaken = new ArrayList<Integer>();
        //ArrayList<Integer> unitsCompleted = new ArrayList<Integer>();
       // ArrayList<Integer> averages = new ArrayList<Integer>();
    
        System.out.println("enter valid file name: ");
        String fileName = in.nextLine();
        //read data into one array
            ArrayList<String> data = readData(fileName);
        //create array of students
            Student x = new Student();
            Student[] studentArray = x.readStudent(data);
            System.out.println("student array: " + studentArray );

        //test process calculations
             x.processCalculations(studentArray);
             unitsTaken = x.getTotalUnitsArr();
             System.out.println("units array: " + Arrays.toString(unitsTaken.toArray()));
*/
        //read data 
            System.out.println("enter valid file name: ");
            String fileName = in.nextLine();
            x.readData(fileName);

        // print values in a chart
            System.out.println("\n\n\nName                Id              Units Taken       Units Completed     Average");
            
            int i = 0;
            while(i <  x.getNamesList().size() ){
                System.out.printf("%-20s%-20s%-20d%n", x.getNamesList().get(i), x.getIdsList().get(i) /*, unitsTaken.get(i)*/  );
                i++;
            }

    }

}