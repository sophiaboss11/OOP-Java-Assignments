
public class test{
    public static void main(String args[]){
        
        String T="", S="";
        for (int i = 1; i <= 3; i++){ 
            for (int j = i; j < 4; j++) {
                 S = S + "!";
            }
                
            S += T + "*"; 
        System.out.println(S);
        }

        
    }
}