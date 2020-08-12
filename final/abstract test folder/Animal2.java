abstract public class Animal2{
    String name;
    int lifespan;

    abstract void noise();
    abstract void feed();

    public void setName(String myname){
        name = myname;
    }

    public String toString(){
        String print = "";
        print = "Animal name: " + name + " lifespan: " + lifespan;
        return print;
    }
    
}