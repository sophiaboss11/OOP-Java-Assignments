public class Dog2 extends Animal2{

    Dog2(){};
    Dog2(String myname, int mylifespan){
        name = myname;
        lifespan = mylifespan;
    }

    void noise(){
        System.out.println(" bark bark ");
    }

    void feed(){
        System.out.println(" I eat meat ");
    }

    @Override
    public String toString(){
        String print = super.toString() + "<<";
        return print;
    }
    
}