// Develop a test class to use both base and derived classes PersonalInfo and Employee and an array of PersonalInfo.

public class TestEmployee{

    public static void main (String args[]){
        PersonalInfo harry = new PersonalInfo("harry, potter","6666","griffindor");
        PersonalInfo hermione = new PersonalInfo("hermione, granger","5555","griffindor");
        Employee snape = new Employee("snape, saverus","4444","slitheryn","hogwartz","potions professor");
        PersonalInfo[] data = {harry, hermione, snape};

        for(int i = 0 ; i < data.length ; i++){
            //data[i].print();
        }

        //test removeAdjacentEvens
        int[] test = {2,6,4};
        snape.removeAdjacentEvens(test);
        
    }
}