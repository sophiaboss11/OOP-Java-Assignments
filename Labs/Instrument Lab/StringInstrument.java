// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields: numStrings, numFrets
   private int numStrings;
   private int numFrets;

   // TODO: Define mutator methods - 
   //      setNumOfStrings(), setNumOfFrets()
   void setNumOfStrings(int numstrings){
       numStrings = numstrings;
   }
   void setNumOfFrets(int numfrets){
    numFrets = numfrets;
}

   // TODO: Define accessor methods -
   //      getNumOfStrings(), getNumOfFrets()
    int getNumOfStrings() {
       return numStrings;
   }
    int getNumOfFrets() {
       return numFrets;
   }

}

