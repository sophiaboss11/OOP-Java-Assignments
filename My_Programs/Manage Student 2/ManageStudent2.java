import java.io.IOException;

/*
main()

/Users/sophia/Documents/GitHub/CSCI_3_Assignments/My_Programs/Manage Student 2/studentinput.txt
D:\Documents D\CSCI_3_Assignments\My_Programs\Manage Student 2\studentinput.txt
*/

import java.util.ArrayList;

public class ManageStudent2{
public static ArrayList<String> data = new ArrayList<String>();
    public static void main(String args[])throws IOException{
        Student2 myStudent = new Student2();
        myStudent.readData();
        myStudent.setStudentArray();
       // myStudent.getAllStudents();

       myStudent.print();
        
    }


    public static ArrayList<String> getData(){
        return data;
    }
    
}

