import java.util.Scanner;
public class TestTriangle{
    public static Scanner scnr = new Scanner(System.in);
    public static void main(String args[]){
        Triangle tri = new Triangle(6, 8);
        Triangle tri2 = new Triangle(6, 8);
        tri.setBase(5);
        tri.setHeight(10);
        tri.getArea();
        System.out.println(tri.getArea());
        System.out.println(tri == tri);
        
        // setBase(5);
        // setHeight(10);
        // getArea();

    }
}