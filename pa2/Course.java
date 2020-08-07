/*
--- UML ---
+ class Course

- String name
- String units

+ void setCourseName(String myCourseName)
+ String getCourseName()
+ void setGrade(String myGrade)
+ String getGrade()
+ void setUnits
+ String getUnits()
+ int calcNumUnits(Student obj)
+ int calcUnitsCompleted(Student obj)
+ double calcGpa(Student obj)
+ print()
  Course() // empty constructor
  Course(string courseName, String grade, string units) // loaded constructor

*/


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Course{
    //fields
    private String courseName, grade, units = "";

    //calculate number of units
    public int calcNumUnits(Student obj){
        int tUnits = 0;
        Course[] courseList = obj.getCourseList();
        for(int i = 0 ; i < courseList.length ; i++){
            int unit = Integer.parseInt(courseList[i].getUnits());
            tUnits+= unit;

        }
        return tUnits;
    }


    //calculate number of units completed   
    public int calcUnitsCompleted(Student obj){
        int cUnits = 0;
        Course[] courseList = obj.getCourseList();

        for(int i = 0 ; i < courseList.length ; i++){

            if(!courseList[i].getGrade().equalsIgnoreCase("f")){
                int unit = Integer.parseInt(courseList[i].getUnits());
                cUnits += unit;
            }
        }
        return cUnits;
        
    }


    //calculate gpa
    public Double calcGpa(Student obj){
        Double gpa = 0.0;
        int tUnits = 0;
        Course[] courseList = obj.getCourseList();
        for(int i = 0 ; i < courseList.length ; i++){
            int unit = Integer.parseInt(courseList[i].getUnits());
            tUnits+= unit;

            int points = 0;
            if(courseList[i].getGrade().equals("A")){
                points = 4;
            }
            else if(courseList[i].getGrade().equals("B")){
                points = 3;
            }
            else if(courseList[i].getGrade().equals("C")){
                points = 2;
            }
            else if(courseList[i].getGrade().equals("D")){
                points = 1;
            }
            else if(courseList[i].getGrade().equals("F")){
                points = 0;
            }
            gpa += Double.parseDouble(courseList[i].getUnits()) * points;
        }
        gpa /= tUnits;

        return gpa;
    }


    //print information
    public void print(ArrayList<String> names, ArrayList<String> lastNames, ArrayList<String> ids, ArrayList<Integer> unitsTaken, ArrayList<Integer> unitsCompleted,  ArrayList<Double> averages, Student[] studentArray, Student x){
        x.processCalculations(studentArray);
        unitsTaken = x.getTotalUnitsArr();
        unitsCompleted = x.getCompletedUnitsArr();
        averages = x.getGpaArr();

        System.out.println("\n\nName                Id                  Units Taken         Units Completed     Average");
        
        ids = x.getIdsList();
        names = x.getNamesList();
        lastNames = x.getLastNamesList();
        int i = 0;
        int totalUnitsCompleted = 0;
        int totalUnitsTaken = 0;
        while(i < names.size() ){
            totalUnitsCompleted += calcUnitsCompleted(studentArray[i]);
            totalUnitsTaken += calcNumUnits(studentArray[i]);
            String fullName = names.get(i) + " " + lastNames.get(i);

            System.out.printf("%-20s%-20s%-20d%-20d%-20.2f%n", fullName, ids.get(i), unitsTaken.get(i), unitsCompleted.get(i), averages.get(i) );
            i++;
        }
        System.out.println("\nTotal number of Students: " + (studentArray.length - 1) + "\n" + "Total Units completed by all students: " + totalUnitsCompleted + "\nTotal Units taken by all students: " + totalUnitsTaken);

    }

    public void output(ArrayList<String> names, ArrayList<String> lastNames, ArrayList<String> ids, ArrayList<Integer> unitsTaken, ArrayList<Integer> unitsCompleted,  ArrayList<Double> averages, Student[] studentArray, Student x)throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter output name: ");
        String outputName = in.nextLine();
        try{
            FileOutputStream fileStream = new FileOutputStream(outputName);
            PrintWriter outFS = new PrintWriter(fileStream);
            //outFS.printf("Hello World!");

            x.processCalculations(studentArray);
            unitsTaken = x.getTotalUnitsArr();
            unitsCompleted = x.getCompletedUnitsArr();
            averages = x.getGpaArr();
    
            outFS.println("\n\nName                Id                  Units Taken         Units Completed     Average");
            
            ids = x.getIdsList();
            names = x.getNamesList();
            lastNames = x.getLastNamesList();
            int i = 0;
            int totalUnitsCompleted = 0;
            int totalUnitsTaken = 0;
            while(i < names.size() ){
                totalUnitsCompleted += calcUnitsCompleted(studentArray[i]);
                totalUnitsTaken += calcNumUnits(studentArray[i]);
                String fullName = names.get(i) + " " + lastNames.get(i);
    
                outFS.printf("%-20s%-20s%-20d%-20d%-20.2f%n", fullName, ids.get(i), unitsTaken.get(i), unitsCompleted.get(i), averages.get(i) );
                i++;
            }
            outFS.println("\nTotal number of Students: " + (studentArray.length - 1) + "\n" + "Total Units completed by all students: " + totalUnitsCompleted + "\nTotal Units taken by all students: " + totalUnitsTaken);

            outFS.flush();
            fileStream.close();
        }
        catch(IOException e){
            System.out.println("Could not output file, exiting");
            System.exit(0);
        }
    }


    //constructors
    Course (String myCourseName, String myGrade, String myUnits){
        courseName = myCourseName;
        grade = myGrade;
        units = myUnits;
    }
    Course (){
        courseName = "none ";
        grade = "none ";
        units = "none ";
    }

    //accessor methods
    public void setCourseName(String myCourseName){
        courseName = myCourseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setGrade(String myGrade){
        grade = myGrade;
    }
    public String getGrade(){
        return grade;
    }
    public void setUnits(String myUnits){
        units = myUnits;
    }
    public String getUnits(){
        return units;
    }


}