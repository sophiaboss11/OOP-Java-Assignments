import java.util.Arrays;
import java.util.ArrayList;

// Develop a derived class named Employee to extend PersonalInfo and include all the necessary components, use as many as the base class methods as possible such as super, over-ridden methods and any other one.

public class Employee extends PersonalInfo{
    String company, role;

    Employee(){}
    Employee(String myname, String myid, String myaddress, String mycompany, String myrole){
        super.setName(myname);
        super.setId(myid);
        super.setAddress(myaddress);
        company = mycompany;
        role = myrole;
    }

    public void setCompany(String mycompany){
        company = mycompany;
    }
    public String getCompany(){
        return company;
    }
    public void setRole(String myrole){
        role = myrole;
    }
    public String getRole(){
        return role;
    }

    @Override
    public String toString(){
        String info = super.toString() + "\nCompany: " + getCompany() + "\nrole: " + getRole();
        return info;
    }

    @Override
    public void print(){
        System.out.println(toString());
    }

    // Write the function removeAdjacentEvens, which removes from a list any even numbers that directly follow another even number in the list. Make sure it is efficient. Use the following heading for the method:

    public void removeAdjacentEvens (int [] list) {

        int count = 0;
        for(int i = 1 ; i < list.length ; i++){
            if(list[i]%2 == 0 &&  list[i-1]%2 == 0){
                list[i] = -2;
                count++;
            }
        }
        int[] n = new int[list.length - count];
        int count2 = 0;
        for(int j = 0 ; j < list.length ; j++){
            if(list[j] != -2){
                n[count2] = list[j];
                count2++;
            }
        }
        list = n;
        System.out.println(Arrays.toString(list));

    }
    
}