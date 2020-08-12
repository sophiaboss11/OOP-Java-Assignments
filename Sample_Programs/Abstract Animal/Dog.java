//Dog class extends Animal class

public class Dog extends Animal{
    Dog(){ name = "Tito"; }
    public void sound(){ System.out.println("Woof"); }
    public void feed (){  System.out.println("I eat meat.");}
//   public void feed(){}// no need for thid method
    public String toString(){
       return "I am a Dog!  My name is "+name ;
    }
}