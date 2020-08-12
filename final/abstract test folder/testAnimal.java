public class testAnimal{
    public static void main (String args[]){

        Dog2 d = new Dog2("buddy", 20);
        d.setName("rover");
        System.out.println( d.toString() );
        d.noise();
        d.feed();
        
    }
}