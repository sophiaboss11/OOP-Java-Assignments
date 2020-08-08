/*

readCourses(arraylist string data) 

readStudent(arraylist string data)

arraylist string getNames()

Course[] getCourses()

arraylist getUnits()

arraylist getGrades()

print()
*/

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Student2{
    String name;
    int numStudents, totalSize, id;
    Course2[] courses = null;
    Student2[] allStudents = null;
    ArrayList<String> lastNames = new ArrayList<String>();
    ArrayList<String> firstNames = new ArrayList<String>();
    ArrayList<String> courseNames = new ArrayList<String>();
    ArrayList<String> grades = new ArrayList<String>();
    ArrayList<Integer> ids = new ArrayList<>();
    ArrayList<Integer> courseCount = new ArrayList<>();
    ArrayList<Integer> units = new ArrayList<>();


    Student2(String nam, int myid, Course2[] cList){
        name = nam;
        id = myid;
        courses = cList;
    }
    Student2(){
        name = null;
        id = 0;
        courses = null;
    }

    void setStudentArray(){
        Student2[] allMyStudents = new Student2[firstNames.size()];
        for(int i = 0 ; i < firstNames.size() ; i++){
            Student2 tempstudent = new Student2();
            String fullname = firstNames.get(i) + "--" + lastNames.get(i);
            tempstudent.setName(fullname);
            tempstudent.setId(ids.get(i));
            //tempstudent.setcc(courseCount.get(i));
            int ccc = courseCount.get(i);

            Course2[] tempca = new Course2[ccc];
            int x = 0;
            for(int j = 0 ; j < ccc ; j++){
                Course2 tempcourse = new Course2();
                tempcourse.setCourseName(courseNames.get(x));
                tempcourse.setGrade(grades.get(x));
                tempcourse.setUnits(units.get(x));

                tempca[j] = tempcourse;
                x++;
            }

            tempstudent.setCourseArr(tempca);
            allMyStudents[i] = tempstudent;
        }
        allStudents = allMyStudents;
    }

    void readData()throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid file name: ");
        String fileName = sc.nextLine();

        try{
            File newFile = new File(fileName);
            if(!newFile.exists()){
                System.out.println("File does not exist, exiting... ");
                System.exit(0);
            }
            Scanner inSS = new Scanner(newFile);
            if(!inSS.hasNext()){
                System.out.println("no data in file, exiting");
                System.exit(0);
            }

            //read data into array
            while(inSS.hasNext()){
                //data.add(inSS.nextLine());
                String next = inSS.nextLine();
                //populate string arrays
                if(next.contains(",")){
                    firstNames.add(next.substring(0, next.indexOf(",")));
                    lastNames.add(next.substring( next.indexOf(",") + 2 , next.length()));                   
                    totalSize += 2;

                    ids.add(inSS.nextInt());
                    int cc = inSS.nextInt();
                    courseCount.add(cc);

                    for(int i = 0; i < cc ; i++){
                        inSS.nextLine();
                        courseNames.add(inSS.nextLine());
                        grades.add(inSS.next());
                        units.add(inSS.nextInt());
                    }
                }

                if(!inSS.hasNext()){
                    break;
                }
            }
        }
        catch(Exception e){
            System.out.println("IO errors, exiting... ");
        }

    }

    void print(){
        Student2[] sarr = getAllStudents();
        //sarr.setStudentArray();
        System.out.println("name                ID                  units taken");
        Course2 c = new Course2();
        for(int i = 0 ; i < firstNames.size() ; i ++){
            System.out.printf("%-20s%-20d%-20d", sarr[i].getName(), sarr[i].getId(), c.calcUnitsCompleted(sarr[i]));
            System.out.println("\n");
        }
    }

    ArrayList<String> getLastNames(){
        return lastNames;
    }
    ArrayList<String> getFirstNames(){
        return firstNames;
    }
    ArrayList<String> getCourseNames(){
        return courseNames;
    }
    ArrayList<String> getGrades(){
        return grades;
    }
    ArrayList<Integer> getIds(){
        return ids;
    }
    ArrayList<Integer> getCourseCount(){
        return courseCount;
    }
    ArrayList<Integer> getUnits(){
        return units;
    }
    Student2[] getAllStudents(){
        return allStudents;
    }

    void setName(String n){
        name = n;
    }
    void setId(int myid){
        id = myid;
    }
    void setCourseArr(Course2[] cArr){
        courses = cArr;
    }

    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    Course2[] getCourseArr(){
        return courses;
    }

    
    
}