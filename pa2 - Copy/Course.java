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
        System.out.println("course list: " + courseList.toString() );

        for(int i = 0 ; i < courseList.length ; i++){
            int unit = Integer.parseInt(courseList[i].getUnits());
            tUnits+= unit;
            //temp solution
            if( i == courseList.length -1 ){
                tUnits += 1;
            }
        }


        return tUnits;
    }


    //calculate gpa


    //print information


}