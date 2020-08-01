/*
UML Student.java

    String name -- first, last
    String id
    String[] CourseList
Student(string name, string id, string[] courses) // constructor

*/

public class Student{
    String name = "";
    String id = "";
    String[] courseList = null;

    Student(String sName, String sId, String[] sCourses){
        name = sName;
        id = sId;
        courseList = sCourses;
    }
    
}