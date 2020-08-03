import java.util.Scanner;

// Uml--
// RightTriangle
// Double l1
// Double l2

// Void, double get/setl1()
// Void, double get/setl2()
// calcArea()
// calcPerimeter()
// RightTriangle() -- constructor
// equals()
// toString()

public class RightTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter length and height of a triangle:");
        double l1 = in.nextDouble();
        double l2 = in.nextDouble();
    
        RightTriangle tri = new RightTriangle();
        tri.setLength1(in.nextDouble());
        tri.setLength2(in.nextDouble());
        tri.toString();
    
       RightTriangle comp = new RightTriangle(5.0, 5.0);
       System.out.println(tri.equals(comp));
    
    }


    public double lengthOne;
    public double lengthTwo;

//constructors
    public RightTriangle(){
        lengthOne = 1;
        lengthTwo = 1;
    }
    public RightTriangle(double l1, double l2){
        l1 = lengthOne;
        l2 = lengthTwo;
    }
//set & get   
    public void setLength1( double myLength ){
        lengthOne = myLength;
    }
    public double getLength1() {
        return lengthOne;
    }
    public void setLength2( double myLength ){
        lengthTwo = myLength;
    }
    public double getLength2() {
        return lengthTwo;
    }
//calculate
    public double calcArea(){
        return lengthOne*lengthTwo/2 ;
    }
    public double calcPerimeter(){
        double perimeter = lengthOne + lengthTwo + Math.sqrt(Math.pow(lengthOne,2) + Math.pow(lengthTwo,2));
        return perimeter;
    }
//equals & toString
    public boolean equals(RightTriangle obj){
        if(lengthOne == obj.getLength1() && lengthTwo == obj.getLength2()){
            return true;
        }else{
            return false;
        }
    }

    @override
    public String toString(){
        System.out.println("area: "+ calcArea() + "\nperimeter: " + calcPerimeter());
        return "";
    }


} 


