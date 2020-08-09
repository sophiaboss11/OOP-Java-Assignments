import java.util.*;
public class TestInheritance {
    public static void main(String[] args) {
        // TODO code application logic here
        Base b1 = new Base();
        Derived d1 = new Derived();
        System.out.println(b1 + "\n"+ d1);
        d1.setId(12345);
        b1.setId(9999);
        d1.setName("Joe Brown");
        System.out.println(b1 + "\n"+ d1);
        d1.getId();
        ArrayList<String> sList = new ArrayList<>();
        sList.add("Hello");
        String s = sList.get(0);
        ArrayList<Base> list = new ArrayList<Base>();
        list.add(b1);
        list.add(d1);
        System.out.println(list.get(0) );
        System.out.println(list.get(1) );
        System.out.println(d1.getNameId());

        System.out.println("\n" + d1.toString() + "\n\n" + b1.toString());
    }
    
}