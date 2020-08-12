class Base {
    public void show() { 
        System.out.println("Base::show() called");
    }
}
class Derived extends Base { 
    public void show() {
    System.out.println("Derived::show() called");
    }
}

class Grandparent {
    public void Print() { 
        System.out.println("Grandparent's Print()");
    }
}
class Parent extends Grandparent { 
    public void Print() { 
        super.Print();
        System.out.println("Parent's Print()");
    }
}
class Child extends Parent { public void Print() {
    super.Print(); System.out.println("Child's Print()");
    }
}

class Complex {
        private final double re; private final double im;
        public Complex(double re, double im) { 
            this.re = re;
            this.im = im;
        }
        public String toString() {
            return "(" + re + " + " + im + "i)";
        }
}

class A{
    protected int i = 10;
}
class B extends A{
   private int i = 20;
   public String toString(){
       return (super.toString()+ "   "+ i);
    }
}


public class practiceFinal{
    public static void main(String[] args){
        A a = new B();
        System.out.println(a);

        Complex cx = new Complex(10, 15); 
        System.out.println("Complex number is " + cx);

        Child c = new Child();
        c.Print();

        Base b = new Derived(); 
        b.show();


        System.out.println(findAlternating("abababab"));
        System.out.println(findAlternating("abcdefghjk"));
        System.out.println("\n" + findMultiple(10,6));
            
    }

    public static boolean findAlternating(String input){
        boolean hasRepeat = false;
        for(int i = 0 ; i < input.length() ; i++){
            char x = input.charAt(i);
            int j = 0;
            while(i != j){
                char y = input.charAt(j);
                if(x == y){
                    hasRepeat = true;
                    break;
                }
                if (j == input.length() - 1){
                    break;
                }
                j++;
            }
        }
        return hasRepeat;
    }

    public static boolean findMultiple(int a, int b){
        boolean ans = false;
        if( a % b == 0){
            ans = true;
        }
        return ans;
    }

    
    
}