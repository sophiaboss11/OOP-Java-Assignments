public class Derived extends Base{
    private String name;
    Derived(){}
    Derived(String s, int id){
        super(id);  // refers to parent  in this case to the constructor
        name = s;
    }
    public int mtd1(){
        return 99;
    }
    public String getName(){ return name;}
    public String getNameId(){
        return name + getId() + "   Der "+ mtd1()+ "  Base " +super.mtd1();
    }
    public void setName(String s){name = s ;}
    public String toString(){
        String temp = name +"\n" ;
        temp += super.toString();//   BasetoString() 
//        temp+= toString();
        return temp;
    }
   
   
}