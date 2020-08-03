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
import java.util.*;
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
    public static Scanner sc;        
    static Student  [] sList = new Student[10];

    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        int  size;
        
        try{
            size = readStudentList();
            //System.out.println(sList[0]);
            printList(sList,size);
        }
        catch (FileNotFoundException e) {
           System.out.println("File problem, check file name or location");
           //e.printStackTrace();
        }
        catch (IOException e){
           System.out.println("I/O problems.");
           //e.printStackTrace();
        }    
        catch (Exception e){
            System.out.println("Unknown problems.");
           e.printStackTrace();
        }
    }
    public static Student addStudent()throws IOException{
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
     public static void addStudent(Student temp)throws IOException{
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
    public static void addStudent(Scanner fileInput, int i)throws Exception{
       
        String tName = fileInput.nextLine();
        float [] score = new float[Student.maxSize];
        for (int j = 0 ; j < score.length; j++)
            score[j] = fileInput.nextFloat();
        sList[i]= new Student(tName, score);
        fileInput.nextLine();
     //   System.out.println(sList[i]);
    }
    public static int readStudentList()throws Exception{
        int i = 0;
        //set up file scanner
        FileInputStream fileByteStream = null; // File input stream
        String  fileName;
        System.out.print("Enter input file name: ");
        fileName = KB.nextLine();
        fileByteStream = new FileInputStream(fileName);
        sc = new Scanner(fileByteStream);

        //File file = new File(fileName);
        //sc = new Scanner(file);
         //Read data from file

        while (sc.hasNextLine()&& i < sList.length) {
           addStudent(sc, i);
           i++;
        }
        sc.close();
        return i ;
    }
    public static void  printList(Student list[], int size)throws Exception{
        FileWriter fileOut ;
    	PrintWriter out ; 
        String  fileName;
        
        System.out.print("Enter output file name: ");
        fileName = KB.nextLine();
        fileOut =new FileWriter(fileName);
        out = new PrintWriter(fileOut);
        System.out.printf("%-25s%-10s\n", "Name","Average");
        out.printf("%-25s%-10s\n", "Name","Average");

        for (int i = 0 ; i < size; i++){
            System.out.printf("%-25s%-10.2f\n",list[i].getName() ,list[i].getAvg());
            out.printf("%-25s%-10.2f\n",list[i].getName() ,list[i].getAvg());
        }
        out.println();
        out.close();   }
}
