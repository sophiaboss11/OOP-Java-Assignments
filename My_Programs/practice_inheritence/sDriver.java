// D:\Documents D\CSCI_3_Assignments\My_Programs\practice_inheritence\United States.txt
///Users/sophia/Documents/GitHub/CSCI_3_Assignments/My_Programs/practice_inheritence/United States.txt
import java.io.IOException;

public class sDriver{
    public static void main(String args[])throws IOException{
        sBase b = new sBase();
        b.readData();
        //b.print();
        sDerived d = new sDerived();
        d.print();
        
    }
    
}