/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mghyam
 */
import java.util.Scanner;
public class loops {
    /**
     * @param args the command line arguments
     */
    static Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        /*Algorithm
        get name
        while name is not XYZ                   Joe Smith
            sum = 0				100 90 89 99 100
            read 5 scores one at a time	// for	Nancy Brown
                get score                       90 90 99 100 100
                Verify Score 0-100 only         XYZ
                if verified                                
                    sum = sum score  
                if not verified
                    ask for a new score
            process average sum/ 5                       
            print results for 1 student
            get name to rest condition
        */
        String name;
        double score, average, sum ;
        System.out.print("Enter student name, enter XYZ to stop : ");
        name = KB.nextLine();                  // set condition
        while (!name.equalsIgnoreCase("XYZ")){   // Check condition
            sum = 0;
            System.out.println("Enter 5 scores seperated by a space for "+ name +": ");
            for (int i = 0 ; i < 5 ; i++){
                score = KB.nextDouble();
                if (score >=0 && score <= 100)
                    sum += score ;
                else{
                    System.out.print("Invalid data, must be between 0 and 100, try again:");
                    score = KB.nextDouble();
                    i--;
                }
            }
            average = sum / 5 ;
            System.out.println(name + "   Average =" + average);
            KB.nextLine();
            System.out.print("Enter student name, enter XYZ to stop: ");
            name = KB.nextLine();
        }
        
    }
    
}
