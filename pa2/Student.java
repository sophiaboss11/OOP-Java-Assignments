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
    private String name, id = "";
    Course[] courseList;
    Course myCourse = new Course();
    public ArrayList<String> namesList = new ArrayList<String>();
    public ArrayList<String> idsList = new ArrayList<String>();
    public ArrayList<String> unitsList = new ArrayList<String>();
    public ArrayList<Integer> indexNamesArr = new ArrayList<Integer>();
    public ArrayList<Integer> totalUnitsArr = new ArrayList<Integer>();
    public ArrayList<Integer> completedUnitsArr = new ArrayList<Integer>();
    public ArrayList<Double> gpaArr = new ArrayList<Double>();
    int totalUnitsTaken;
    int totalUnitsCompleted;
    
    public void setCourseList(ArrayList<String> data){
        int numCourses = (data.size() -2)/ 2;
        Course[] courseArray = new Course[numCourses];
        int count = 0;
        //myData = data;

        for(int i = 0 ; i < numCourses ; i++ ){

            String courseName = data.get(2*i + 2);
            String grade = data.get(2*i+3).substring(0,1);
            String units = data.get(2*i+3).substring(2,3);

            //add to lists
            unitsList.add(units);

            //add course
            Course tempCourse = new Course(courseName, grade, units);
            courseArray[count] = tempCourse ;
            count++;
        }
        courseList = courseArray;
    }

    public Course[] getCourseList(){
        return courseList;
    }
    public ArrayList<String> getUnitsList(){
        return unitsList;
    }
      
    public Student[] readStudent(ArrayList<String> data){
        
        ArrayList<Integer> indexarr = new ArrayList<Integer>();

        //create indexarr
        for(int i = 0 ; i < data.size() ; i++){
            if(data.get(i).contains(",") || i == data.size() - 1){
                indexarr.add(i);     
            }
        }
        indexNamesArr = indexarr;
        Student[] students = new Student[indexarr.size()];
  
        //create sections of data
        int x = 0;
        for(int j = 0 ; j < indexarr.size() - 1 ; j++){
            name = data.get( indexarr.get(j) );
            id = data.get(indexarr.get(j) + 1 ).substring(0, data.get(indexarr.get(j) + 1 ).length() - 2);
            namesList.add(name);
            idsList.add(id);

            ArrayList<String> section = new ArrayList<String>();

            //while in the same section, add to it > exits when reaches next name
            while( x != indexarr.get(j+1)){
                section.add(data.get(x));
                x++;
            }
            if(x == data.size() - 1){
                section.add(data.get(x));
            }
 
            System.out.println("section: " + Arrays.toString(section.toArray()) + "\n");

            //course list for student
            setCourseList( section );
            Course[] tempCourseList = getCourseList();
            Student tempStudent = new Student(name, id, tempCourseList);
            students[j] = tempStudent;
            System.out.println("tempstudent: " + tempStudent + "\n");
        }
        return students;
    }

    public void processCalculations(Student[] studentArray){
        for(int  i = 0 ; i < studentArray.length - 1 ; i++){

            //test calcNumUnits
            System.out.println("\n\nnumber units for student: " + myCourse.calcNumUnits( studentArray[i]) );

            totalUnitsArr.add(myCourse.calcNumUnits( studentArray[i] ));

            //test calcUnitsCompleted
            System.out.println("\ncompleted units for student: " + myCourse.calcUnitsCompleted( studentArray[i]) );

            completedUnitsArr.add(myCourse.calcUnitsCompleted( studentArray[i] ));

            //test calcGpa
            gpaArr.add(myCourse.calcGpa(studentArray[i]));


        }
    }
    public int getTotalUnitsTaken(){
        return totalUnitsTaken;
    }
    public int getTotalUnitsCompleted(){
        return totalUnitsCompleted;
    }
    public ArrayList<Double> getGpaArr(){
        return gpaArr;
    }

    public ArrayList<Integer> getIndexArr(){
        return indexNamesArr;
    }

    public ArrayList<Integer> getTotalUnitsArr(){
        return totalUnitsArr;
    }

    public ArrayList<Integer> getCompletedUnitsArr(){
        return completedUnitsArr;
    }

    public ArrayList<String> getNamesList(){
        return namesList;
    }

    public ArrayList<String> getIdsList(){
        return idsList;
    }


    //constructors
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

    //accessor methods
    public void setName(String myName){
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setId(String myId){
        id = myId;
    }
    public String getId(){
        return id;
    }


}