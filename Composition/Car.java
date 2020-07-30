/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author useradmin
 */
public class Car {
    private String	make, model,  manufacturer ;
    private Engine	e1 ;
    Car (String make, String model, String manufacturer,Engine e) { 
        this.make = make;
        this.model = model; 
        this.manufacturer = manufacturer; 
        e1 = new Engine(e) ;
    } 
    Car (){ 
        make = "4 Wheel Drive" ;
        model = "Blazer" ;
        manufacturer = "Chevrolet" ;
        e1 = new Engine("4.6 L V8");
    }
    Car (Car obj){
        make = obj.make;
        model = obj.model;
        manufacturer = obj.manufacturer;
        e1 = new Engine(obj.e1);
    }
    public String getMake () { return make; } 
    public String getModel () { return model; } 
    public String getManufacturer () { return manufacturer; }
    public String getType(){ return e1.getType() ;}
    public Engine getEngine(){ return e1 ;} 
    public void setType(String T){e1.setType(T);}
    public void setModel( String M){model = M ;}
    public void setMake(String mk){ make = mk ;}
    public void setManufacturer (String man) { manufacturer = man ;}
    public String toString() {
        return "\nCar information: "+ "\tMake = " + make + "\tModel = " + model +
                "\tManufacturer: " + manufacturer  + e1;
    }
}