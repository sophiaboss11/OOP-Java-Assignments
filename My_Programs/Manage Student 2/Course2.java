/*
calc gpa(student)

calc units(student)

getGrade()

getUnits()
*/

import java.util.ArrayList;

public class Course2{
    private String courseName, grade = " ";
    private int units;


    Course2(String name, String myGrade, int myUnits){
        courseName = name;
        grade = myGrade;
        units = myUnits;
    }
    Course2(){
        courseName = null;
        grade = null;
        units = 0;
    }

    int calcUnitsCompleted(Student2 obj){
        // get course count, for cc, add getunits to total units
        Course2[] myca = obj.getCourseArr();
        int totalUnits = 0;
        for(int i = 0 ; i < myca.length ; i++){
            totalUnits += myca[i].getUnits();
        }
        return totalUnits;
    }

    void setCourseName(String name){
        courseName = name;
    }
    String getCourseName(){
        return courseName;
    }
    void setGrade(String myGrade){
        grade = myGrade;
    }
    String getGrade(){
        return grade;
    }
    void setUnits(int myUnits){
        units = myUnits;
    }
    int getUnits(){
        return units;
    }
}