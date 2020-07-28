/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition ;
/**
 *
 * @author useradmin
 */
public class Engine {
    private String 	type;   // data element

    Engine (String type) {
        this.type = type; 
    } 
    Engine(Engine t){
        type = t.type;
    }
    public String getType ()  {  return type; }
    public void setType (String T){type = T ;}
    public String toString() {
        return "\nEngine Type = " + type ;
    }
 }