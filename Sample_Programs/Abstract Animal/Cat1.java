//Cat class extends Animal class
public class Cat1 extends Animal{

    Cat1(){ 
        name = "Tiger";    
    }

    Cat1(String s){   
        super(s); 
    }

    public void sound(){ 
        System.out.println("Meow");
    }

    public void feed (){  
        System.out.println("I eat fish."); 
    }
        
    public String toString(){
        return (super.toString()+ " I am a Cat! My name is :"+name);
    }
}