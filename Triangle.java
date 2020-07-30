import java.util.*;
public class Triangle{
    private double base, height;

    public void setHeight(int height){
        if(height > 0 ){
            height = this.height;
        }    
    }
    public void setBase( int base){
        if(base > 0 ){
            base = this.base;
        } 
    }
    public void setDimensions(int base, int height){
        if(height > 0 && base > 0){
            height = this.height;
            base = this.base;
        } 
    }
    public int getBase(){
        return base;
    }
    public int getHeight(){
        return height;
    }
    public int getArea(){
        return (base * height) / 2 ;
    }
    public int getPerimeter(){
        return base + height + Math.squrt(Math.pow(base,2) + Math.pow(height, 2));
    }
    public String toString(){
        String temp = "";
        temp = "Base = "+ getBase() + " Height = "+ getHeight() + "Area = "+ getArea() +"Perimeter = "+ getPerimeter();
        return temp;
    }
    public boolean equals(triangle obj){
        if (height == obj.getHeight() && base == obj.getBase())
	    return true;
	return false ;
    }
}


