//import java.util.*;
public class Triangle{
    private double base, height;

    Triangle(double b, double h){
        base = b;
        height = h;
    }

    public void setHeight(double height){
        if(height > 0 ){
            height = this.height;
        }    
    }
    public void setBase( double base){
        if(base > 0 ){
            base = this.base;
        } 
    }
    public void setDimensions(double base, double height){
        if(height > 0 && base > 0){
            height = this.height;
            base = this.base;
        } 
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return (base * height) / 2 ;
    }
    public double getPerimeter(){
        return base + height + Math.sqrt( Math.pow(base,2) + Math.pow(height, 2));
    }
    public String toString(){
        String temp = "";
        temp = "Base = "+ getBase() + " Height = "+ getHeight() + "Area = "+ getArea() +"Perimeter = "+ getPerimeter();
        return temp;
    }
    public boolean equals(Triangle obj){
        if (height == obj.getHeight() && base == obj.getBase())
	    return true;
	return false ;
    }
}


