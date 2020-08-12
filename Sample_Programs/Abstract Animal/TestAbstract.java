public class TestAbstract {
    public static void main(String args[]){
	Animal obj = new Dog(), c1 = new Cat1(), c2 = new Cat1("Floffy");
	obj.sound();
        obj.feed();
        c1.sound();
        c1.feed();
        System.out.println(c1 + "\n" + obj);
        System.out.println(c2 + "\n" + obj);
       
        System.out.println(c1.getName());
        c1.setName("Lion");
        System.out.println(c1.getName());
        
        System.out.println(obj.getName());
        obj.setName("Wolfy");
        System.out.println(obj.getName());
        //Animal a1 = new Animal();  
        //NO --> Abstract class can't be instantiated
   }
}