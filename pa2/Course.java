/*
UML Course.java

String name
String units
int unitsTaken
int unitsCompleted
double average

course(string courseName, String grade, string units)

calcNumUnits()
calcGpa()
print()

*/
// import java.util.ArrayList;
// import java.util.Arrays;

public class Course{
    private String courseName, grade, units = "";
    //private int totalUnits;

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


}