/*
--- UML ---
+ class Student

- String name
- String id
- int totalUnitsTaken
- int totalUnitsCompleted
- Course[] courseList
- Course myCourse
- ArrayList<String> namesList
- ArrayList<String> idsList
- ArrayList<String> unitsList
- ArrayList<Integer> indexNamesArr
- ArrayList<Integer> totalUnitsArr
- ArrayList<Integer> completedUnitsArr
- ArrayList<Double> gpaArr

+ void setCourseList(ArrayList<String> data)
+ Student[] readStudent(ArrayList<String> data)
+ void processCalculations(Student[] studentArray)
+ Course[] getCourseList()
+ ArrayList<String> getUnitsList()
+ int getTotalUnitsTaken()
+ int getTotalUnitsCompleted()
+ ArrayList<Double> getGpaArr()
+ ArrayList<Integer> getIndexArr()
+ ArrayList<Integer> getTotalUnitsArr()
+ ArrayList<Integer> getCompletedUnitsArr()
+ ArrayList<String> getNamesList()
+ ArrayList<String> getIdsList()
+ void setName(String myName)
+ String getName()
+ void setId(String myId)
+ String getId()
  Student() // empty constructor
  Student(String sName, String sId, Course[] sCourses) // loaded constructor

*/


import java.util.ArrayList;

public class Student{
    //fields
    private String name, lastName, id = "";
    private int totalUnitsTaken;
    private int totalUnitsCompleted;
    private Course[] courseList;
    private Double average;
    private Course myCourse = new Course();
    private ArrayList<String> namesList = new ArrayList<String>();
    private ArrayList<String> lastNamesList = new ArrayList<String>();
    private ArrayList<String> idsList = new ArrayList<String>();
    private ArrayList<String> unitsList = new ArrayList<String>();
    private ArrayList<Integer> indexNamesArr = new ArrayList<Integer>();
    private ArrayList<Integer> totalUnitsArr = new ArrayList<Integer>();
    private ArrayList<Integer> completedUnitsArr = new ArrayList<Integer>();
    private ArrayList<Double> gpaArr = new ArrayList<Double>();

    
    //mutator methods
    public void setCourseList(ArrayList<String> data){
        int numCourses = (data.size() -2)/ 2;
        Course[] courseArray = new Course[numCourses];
        int count = 0;

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
            name = data.get( indexarr.get(j) ).substring(data.get( indexarr.get(j) ).indexOf(",") + 2, data.get( indexarr.get(j) ).length() );

            lastName = data.get( indexarr.get(j) ).substring(0, data.get( indexarr.get(j) ).indexOf(",") );

            id = data.get(indexarr.get(j) + 1 ).substring(0, data.get(indexarr.get(j) + 1 ).length() - 2);

            namesList.add(name);
            lastNamesList.add(lastName);
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
 
            //course list for student
            setCourseList( section );
            Course[] tempCourseList = getCourseList();
            Student tempStudent = new Student(name, id, tempCourseList);
            students[j] = tempStudent;
        }
        return students;
    }

    public void processCalculations(Student[] studentArray){
        for(int  i = 0 ; i < studentArray.length - 1 ; i++){
            //calcNumUnits
            totalUnitsArr.add(myCourse.calcNumUnits( studentArray[i] ));

            //calcUnitsCompleted
            completedUnitsArr.add(myCourse.calcUnitsCompleted( studentArray[i] ));

            // calcGpa
            gpaArr.add(myCourse.calcGpa(studentArray[i]));
        }
    }

    //accessor methods
    public Course[] getCourseList(){
        return courseList;
    }
    public ArrayList<String> getUnitsList(){
        return unitsList;
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
    public ArrayList<String> getLastNamesList(){
        return lastNamesList;
    }
    public ArrayList<String> getIdsList(){
        return idsList;
    }
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
    public double getAverage(){
        return average;
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

}