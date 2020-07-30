/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projstudent;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author useradmin
 */
public class ProjStudent {

    /**
     * @param args the command line arguments
     */
    public static Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Student  s1, s2;
        s1 = addStudent();
        s2 = new Student();
        printStudent(s1);
        addStudent(s2);
        printStudent(s2);
        float [] t = {100, 90, 90};
        s2.setScores(t);
        printStudent(s2);
        System.out.println(s2.getName());
        System.out.println(s2);
        
    }
    public static Student addStudent(){
        Student temp ;
        System.out.print("Please enter student full name: ");
        String tName = KB.nextLine();
        float [] score = new float[Student.maxSize];
        System.out.print("Enter 3 scores between 0-100 seperated by a space: ");
        for (int i = 0 ; i < score.length; i++)
            score[i] = KB.nextFloat();
        temp = new Student(tName, score);
        KB.nextLine();
        
        return temp;
    }
     public static void addStudent(Student temp){
        System.out.print("Please enter student full name: ");
        String tName = KB.nextLine();
        float [] score = new float[Student.maxSize];
        System.out.print("Enter 3 scores between 0-100 seperated by a space: ");
        for (int i = 0 ; i < score.length; i++)
            score[i] = KB.nextFloat();
        temp.setData(tName, score);
        KB.nextLine();
    }
    public static void printStudent(Student temp){
        System.out.println("Student name:        "+ temp.getName());
        float [] sTemp = temp.getScores();
        System.out.print("Student scores:      ");
        for (int i =0 ; i < sTemp.length ; i++)
            System.out.print( sTemp[i] +"  ");
        System.out.println("\nStudent Average:     " +temp.getAvg());
        System.out.println("Student Grade:       " + temp.getGrade());
    }
}
