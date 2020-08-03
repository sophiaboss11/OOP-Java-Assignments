/*
UML Student.java

    String name -- first, last
    String id
    String[] CourseList
Student(string name, string id, string[] courses) // constructor

*/
import java.util.Arrays;
import java.util.ArrayList;

public class Student{
    String name, id = "";
    Course[] courseList = null;

    Student(String sName, String sId, Course[] sCourses){
        name = sName;
        id = sId;
        courseList = sCourses;
    }
    Student(){
        name = null;
        id = null;
        courseList = null;
    }

    //only gets list for one student object
    public Course[] getCourseList(ArrayList<String> data){
        //int size = data.size() / 2;  //subtract by 2
        int size = (data.size() -2)/ 2;
        Course[] courseArray = new Course[size];
        int count = 0;

        for(int i = 2 ; i < data.size() ; i+=2 ){

            String courseName = data.get(i);
            //may need to delete whitespace
            String grade = data.get(i+1).substring(0,1);
            String units = data.get(i+1).substring(2,3);

            //add course
            Course tempCourse = new Course(courseName, grade, units);
            courseArray[count] = tempCourse ;
            count++;
        }
        return courseArray;
    }
    
    
    public Student[] readStudent(ArrayList<String> data){
        
        ArrayList<Integer> indexarr = new ArrayList<Integer>();

        //create indexarr
        for(int i = 0 ; i < data.size() ; i++){
            if(data.get(i).contains(",") || i == data.size() - 1){
                indexarr.add(i);     
            }
        }
        System.out.println("\nindexarr: " + Arrays.toString(indexarr.toArray()) + "\n\n");

        Student[] students = new Student[indexarr.size()];
  
        //create sections of data
        int x = 0;
        for(int j = 0 ; j < indexarr.size() - 1 ; j++){
            name = data.get( indexarr.get(j) );
            id = data.get(indexarr.get(j) + 1 );
            ArrayList<String> section = new ArrayList<String>();
                System.out.println(">new student\n" + "Name: " + name + " ID: " + id);

            //while in the same section, add to it > exits when reaches next name
            while(!data.get(x).equals( data.get( indexarr.get(j+1) ) )){
                section.add(data.get(x));
                x++;
            }

            System.out.println("section: " + Arrays.toString(section.toArray()) + "\n");

            //course list for student
            Course[] tempCourseList = getCourseList( section );

            Student tempStudent = new Student(name, id, tempCourseList);//maybe don't make new student each time

            students[j] = tempStudent;
            System.out.println("tempstudent: " + tempStudent + "\n");
        }
        return students;
        //System.out.println( "STUDENTS>> " + students );
    }




}