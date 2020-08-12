

//abstract parent class
abstract class Animal{
    protected String  name;
   //abstract method
    Animal(){}
    Animal(String n){
         name = n;
        }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }
   public abstract void sound();
   public abstract void feed();
   public String toString(){
       return "I am an Animal!";
   }
}

//test interface
interface DogInterface{
    void bark();
    void poop();
}

