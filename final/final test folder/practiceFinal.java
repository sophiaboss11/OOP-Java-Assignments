public class practiceFinal{
    public static void main(String[] args){
        System.out.println(findAlternating("abababab"));
        System.out.println(findAlternating("abcdefghjk"));
        System.out.println("\n" + findMultiple(10,6));

        // for (int i = 0; i = 5; i++){
        //     System.out.print(i + 1);
        //     }
            
    }

    public static boolean findAlternating(String input){
        boolean hasRepeat = false;
        for(int i = 0 ; i < input.length() ; i++){
            char x = input.charAt(i);
            int j = 0;
            while(i != j){
                char y = input.charAt(j);
                if(x == y){
                    hasRepeat = true;
                    break;
                }
                if (j == input.length() - 1){
                    break;
                }
                j++;
            }
        }
        return hasRepeat;
    }

    public static boolean findMultiple(int a, int b){
        boolean ans = false;
        if( a % b == 0){
            ans = true;
        }
        return ans;
    }

    
    
}