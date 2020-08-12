// Develop a base class named PersonalInfo to include name, ID and address of a person. Include all the necessary components: constructor, getters, setters, …..

public class PersonalInfo{
    private String name, ID, address;
    PersonalInfo(){}
    PersonalInfo(String myname, String myid, String myaddress){
        name = myname;
        ID = myid;
        address = myaddress;
    }
    
    public void setName(String myname){
        name = myname;
    }
    public String getName(){
        return name;
    }
    public void setId(String myid){
        ID = myid;
    }
    public String getId(){
        return ID;
    }
    public void setAddress(String myadd){
        address = myadd;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        String info = "\nname: " + getName() + "\nID: " + getId() + "\naddress: " + getAddress();
        return info;
    }
    public void print(){
        System.out.println(toString());
    }
}