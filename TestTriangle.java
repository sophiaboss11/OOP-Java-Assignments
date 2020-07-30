public class TestTriangle{
    public static Scanner scnr = new Scanner(System.in);
    public static void main(String args[]){
        Triangle tri = new Triangle();
        tri.setBase(5);
        tri.setHeight(10);
        tri.getArea();
        System.out.println(tri.getArea());

    }
}