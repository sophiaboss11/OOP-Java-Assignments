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
public class Dealer {
    private Car[]    carLot;
    private int     size, capacity  ;
    
    Dealer(){
        size = 0 ;
        capacity = 100 ;
        carLot = new Car[100];
    }
    Dealer(int s){
        size = 0 ;
        capacity = s ;
        carLot = new Car[s];
    }
    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCar(Car c){
        carLot[size]= new Car(c);
        size++;
    }
    public Car getCar(int i){
        if (i < size && i >=0)
            return carLot[i];
        else
            return null;
    }
}
