import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
      Scanner scnr2 = new Scanner(System.in);
      //String sentence = scnr.nextLine();
      String word = scnr2.next();
      int count = 1;

      /* if equals "word" increment frequency 
      loop through string, print next()*/

      //while word.hasNext(), print word, word = scnr2.next()
         //while word = scnr.next(), count++
      //println count 

      while(scnr.hasNext()){
         //System.out.print(word);
         word = scnr2.next();

            while(scnr.hasNext()){
               if(word.equals(scnr.next()) ){
                  count++;
                  //System.out.println(count);
               }
            }

            System.out.println(word + " " + count);
            count = 1;
      }      
   }
}


import java.util.Scanner;

public class LabProgram {

public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   String[] words = new String[n];
      for (int i = 0; i < words.length; i++) {
         words[i] = in.next();
      }
      int count;
      for (int i = 0; i < words.length; i++) {
         count = 0;
         for (int j = 0; j < words.length; j++) {
            if (words[i].equals(words[j])) {
            ++count;
            }
      }
   System.out.println(words[i] + " " + count);
   }
}
}
