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

/**
 *
 * @author useradmin
 */
public class Student {
    final public static int maxSize = 3 ;
    private float average;
    private float [] scores;
    private String name, grade;
    
    public Student(){
        average = 0;
        scores = new float[maxSize];
        for (int i =0 ; i < maxSize; i++)
            scores[i]= 0;
    }
    public Student(String nTemp, float tScores[]){
        scores = new float[maxSize];
        setName(nTemp);
        setScores(tScores);
        calcAvg();
    }
    private boolean verifyName(String temp){
        if (temp.length() > 0)
            return true;
        else
            return false;
    }
    private boolean verifyScores(float temp[]){
        for (int i = 0 ; i < temp.length ;i++)
            if (temp[i] >100 || temp[i] < 0)
                return false;
        return true;
    }
    private void calcAvg(){
        float sum = 0;
        for(int i = 0 ; i < scores.length ; i++)
            sum += scores[i];
        average = sum/scores.length;
        setGrade();
    }
    private void setGrade(){
        if (average >= 90.0)
            grade = "A";
        else if (average >= 80.0)
            grade = "B";
        else if (average >= 70.0)
            grade = "C";
        else if (average >= 60.0)
            grade = "D";
        else 
            grade = "F";
    }
    public String getName(){
        return name;
    }
    public String getGrade(){
        return grade;
    }
    public float[] getScores(){
        return scores;
    }
    public float getAvg(){
        return average;
    }
    public void setScores(float []temp){
        if (verifyScores(temp)){
            scores = temp;
            calcAvg();
        }
        else
            System.out.println("Invalid values, scores are not updated\n");
    }
    private void setName(String temp){
        if (verifyName(temp))
            name = temp;
    }
    public void setData(String nTemp, float tScores[]){
        setName(nTemp);
        setScores(tScores);
        calcAvg();
    }
    public String toString(){
        String temp ;
        temp = name + "  average: " + average ;
        return temp ;
    }
}
