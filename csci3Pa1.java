/*
reads input and outputs interest and prints details
terminate program when the end of the file is reached 
*/
/*      
concepts:   1. input ouput, enter file name + intro output
            2. if statements calculating interest rates
            3. determine codes, calculate with formula
likely exception handling? terminate file when end is reached
             sample input:              Joseph Kardian III
                                        1500  4  a
enter name, amount of money on deposit and a number of years it has been on deposit
while input is valid
    */
public class csci3Pa1{
    public static Scanner scnr = new Scanner(System.in);
    public static void main (String args[]){
 
        FileReader fileReader = null;
        String fileName;
        int charRead = 0;

        System.out.println("              Program Number 1\n         Joe Blake\n        Computer Science 3");

        System.out.print("Enter a valid file name: ");
        fileName = scnr.next();
        System.out.print("you entered "+ fileName);
        



    }

}