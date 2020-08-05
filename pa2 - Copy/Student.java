/*
UML Student.java

    String name -- first, last
    String id
    String[] CourseList
Student(string name, string id, string[] courses) // constructor

*/
import java.util.Arrays;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Student{
    private String name, id = "";
    Course[] courseList;
    Course myCourse = new Course();
    private ArrayList<String> namesList = new ArrayList<String>();
    private ArrayList<String> idsList = new ArrayList<String>();
    private ArrayList<String> unitsList = new ArrayList<String>();
    private ArrayList<Integer> indexNamesArr = new ArrayList<Integer>();
    private ArrayList<Integer> totalUnitsArr = new ArrayList<Integer>();
    private ArrayList<Integer> numClassesList = new ArrayList<Integer>();

    public void readData(String fName)throws IOException{
        File input = new File(fName);
        Scanner inSS;
       // int i = 0;

        if(!input.exists()){
            System.out.println("file does not exist, exiting");
            System.exit(0);
        }
        try{
            inSS = new Scanner(input);
            //check if empty
            if(!inSS.hasNext()){
                System.out.println("no data in file, exiting");
                System.exit(0);
            }

            ArrayList<String> section = new ArrayList<String>();
            //populate arrays
            while(inSS.hasNext()){
               // fullList.add(inSS.nextLine());
               // System.out.println("> " + list.get(i));
                if(inSS.nextLine().contains(",")){
                    //names array
                    namesList.add(inSS.nextLine());
                    //ids array
                    idsList.add(inSS.next());
                    //numclasses
                    int numClasses = inSS.nextInt();
                    numClassesList.add(numClasses);

                    
                    for(int j = 0 ; j < numClasses * 2 ; j ++){
                        section.add(inSS.nextLine());
                    }
                    //course list array
                    setCourseList(section);

                }
               // i++;
            }
        }
        catch(IOException e){
            System.out.println("Could not attatch file, exiting");
            System.exit(0);
        }
    }

    
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
   
    public Student[] readStudent(ArrayList<String> data){
        
        ArrayList<Integer> indexarr = new ArrayList<Integer>();

        //create indexarr
        for(int i = 0 ; i < data.size() ; i++){
            if(data.get(i).contains(",") || i == data.size() - 1){
                indexarr.add(i);     
            }
        }
        System.out.println("\nindexarr: " + Arrays.toString(indexarr.toArray()) + "\n\n");
        indexNamesArr = indexarr;
        Student[] students = new Student[indexarr.size()];
  
        //create sections of data
        int x = 0;
        for(int j = 0 ; j < indexarr.size() - 1 ; j++){
            name = data.get( indexarr.get(j) );
            id = data.get(indexarr.get(j) + 1 );
            namesList.add(name);
            idsList.add(id);

            ArrayList<String> section = new ArrayList<String>();
                System.out.println(">new student\n" + "Name: " + name + " ID: " + id);

            //while in the same section, add to it > exits when reaches next name
            while(!data.get(x).equals( data.get( indexarr.get(j+1) ) )){
                section.add(data.get(x));
                x++;
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

            totalUnitsArr.add(myCourse.calcNumUnits(studentArray[i]));
        }
    }

    //accessor methods for arrays
    public Course[] getCourseList(){
        return courseList;
    }
    public ArrayList<String> getUnitsList(){
        return unitsList;
    }
   
    public ArrayList<Integer> getIndexArr(){
        return indexNamesArr;
    }

    public ArrayList<Integer> getTotalUnitsArr(){
        return totalUnitsArr;
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