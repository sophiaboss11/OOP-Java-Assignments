import java.util.ArrayList;

class Student { 
    String name, dept; 
    int id ; 
    Student(String name, int id, String dept){ 
         this.name = name; 
         this.id = id; 
         this.dept = dept; 
    } 
    public String toString(){
       return ("Name: "+name + " ID: "+id+ " Department: "+dept);
    }
} 
class Department{ 
    String name; 
    private ArrayList<Student> students; 
    Department(String name, ArrayList<Student> students) {
       this.name = name; 
       this.students = students; 
    } 
    public ArrayList<Student> getStudents(){ return students; } 
    public String toString(){ return name;}
}

class Institute { 
    String instituteName; 
    private ArrayList<Department> departments; 
    Institute(String instituteName, ArrayList<Department> departments) { 
       this.instituteName = instituteName; 
       this.departments = departments; 
    } 
    public int getTotalStudentsInInstitute(){ 
       int  num = 0; 
       ArrayList<Student> students; 
       for(Department dept : departments) { 
         students = dept.getStudents(); 
         for(Student s : students) 
              num++; 
       } 
       return num; 
    } 
    public String getStudentList(){ 
       ArrayList<Student> students; 
       String temp ="";
       for(Department dept : departments) { 
           students = dept.getStudents(); 
           for(Student s : students) 
              temp += s+ "\n";
       } 
       return temp; 
    } 
    public String toString(){ 
       String temp = instituteName +" in departments: ";
       for (Department d :departments)
          temp += d +" " ;
       return temp;
    }
}

public class Ts{
    public static void main(String args[]){
        Student s1 = new Student("Mia", 1, "CSE"); 
        Student s2 = new Student("Priya", 2, "CSE"); 
        Student s3 = new Student("John", 1, "EE"); 
        Student s4 = new Student("Rahul", 2, "EE"); 
        ArrayList <Student> cse_students = new ArrayList<>(); 
        cse_students.add(s1); 
        cse_students.add(s2); 
        ArrayList <Student> ee_students = new ArrayList<>(); 
        ee_students.add(s3); 
        ee_students.add(s4); 
        Department CSE = new Department("CSE", cse_students); 
        Department EE = new Department("EE", ee_students); 
        ArrayList <Department> departments = new ArrayList<>(); 
        departments.add(CSE); 
        departments.add(EE); 
        Institute institute = new Institute("BITS", departments); 
        System.out.print("Total students in institute "+ institute + "is "); 
        System.out.println(institute.getTotalStudentsInInstitute()); 
        System.out.println(institute.getStudentList());
    }
}