/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mghyam
 */
public class Base {
    private int id ;
    Base(){}
    Base(int id){ this.id = id ;}
    public int getId(){ return id;}
    public void setId(int id){
        this.id = id ;
    }
    public String toString(){
        return "Id :" + id ;
    }
    public int mtd1(){
        return id/2 ;
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (obj == null )
            return false ;
        if(obj.getClass().equals(getClass())){
            Base b1 = (Base)obj;
            if (b1.id == id )
                return true;
        }
        return false;
            
    }
}