import java.util.Arrays;

public class sDerived extends sBase{
    int numCases;

    sDerived(){};

    //getnumcases

    //toString()
    @Override
    public void print(){
        super.print();
        System.out.println("dates: " + Arrays.toString(super.getDatesList().toArray()));
    }

}