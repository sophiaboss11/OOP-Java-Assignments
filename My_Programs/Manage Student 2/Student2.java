/*

readCourses(arraylist string data) 

readStudent(arraylist string data)

arraylist string getNames()

Course[] getCourses()

arraylist getUnits()

arraylist getGrades()

print()
*/
import java.util.ArrayList;

public class Student2{
    String name, id = "";
    Course2[] courses = null;
    Student2[] allStudents = null;

    Student2(String nam, String myid, Course2[] cList){
        name = nam;
        id = myid;
        courses = cList;
    }
    Student2(){
        name = null;
        id = null;
        courses = null;
    }

    public Student2[] readCourses(ArrayList<String> myData){
        ArrayList<String> sNames = new ArrayList<String>();
        ArrayList<String> sIds = new ArrayList<String>();
        ArrayList<Integer> ind = new ArrayList<Integer>();
        
        //populate index array
        for(int i = 0 ; i < myData.size() ; i++){
            if(myData.get(i).contains(",")){
                ind.add(i);
                sNames.add(myData.get(i));
                sIds.add(myData.get(i + 1));
            }
            else if( i == myData.size() - 1){
                ind.add(i + 2);
            }
        }
        Student2[] students = new Student2[ind.size()];
    //loop through input, for every class, create a new course, set the name, grade, and units, and then add it to the courselist
        int x = 0;
        for(int j = 0 ; j < ind.size() ; j++){
            Course2[] courseList = new Course2[(ind.get(j+1)) - ind.get(j) - 2];
            while(!myData.get(x).equals( myData.get(ind.get(j + 1)) )){
                //create new course
                
                Course2 tempCourse = new Course2();
                tempCourse.setCourseName( myData.get(x*2 + 2) );
                tempCourse.setGrade( myData.get(x*2 + 3).substring(0,1) );
                tempCourse.setUnits( Integer.parseInt(myData.get(x*2 + 3).substring(2,3) ));
                courseList[j] = tempCourse;
                x++;
            }

            Student2 tempStudent = new Student2(sNames.get(j), sIds.get(j), courseList);
            students[j] = tempStudent;
        }
        allStudents = students;
        return students;
    }

    public Student2[] getAllStudents(){
        return allStudents;
    }
    
}