
public class StringInstrument extends Instrument {

   private int numStrings;
   private int numFrets;

   void setNumOfStrings(int numstrings){
       numStrings = numstrings;
   }
   void setNumOfFrets(int numfrets){
    numFrets = numfrets;
}
    int getNumOfStrings() {
       return numStrings;
   }
    int getNumOfFrets() {
       return numFrets;
   }

}

