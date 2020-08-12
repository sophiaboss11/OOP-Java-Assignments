import java.io.IOException;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class sBase{
    String date = "";
    int casee = 0;
    ArrayList<String> cases = new ArrayList<>();
    ArrayList<String> dates = new ArrayList<>();

    sBase(){};
    sBase(String mydate, int mycase){
        date = mydate;
        casee = mycase;
    }


    //read data, find number of entries per list> set size for arrays. 
    //store data into arrays
    public void readData()throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("enter a valid file name: ");
        String filename = in.nextLine();
        try{
            File f = new File(filename);
            Scanner inSS = new Scanner(f);

            while(inSS.hasNext()){
                //find the space index
                int space = 0;
                String next = inSS.nextLine();

                if(!next.equals("")){
                    cases.add(next);
                }
                else{
                    break;
                }

                if(!inSS.hasNext()){
                    break;
                }
            }

            while(inSS.hasNext()){
                String next = inSS.nextLine();

                if(!next.equals("")){
                    dates.add(next);
                }
                else{
                    break;
                }

                if(!inSS.hasNext()){
                    break;
                }
            }

        }
        catch(Exception e){
            System.out.println("IO errors, exiting.. ");
            System.exit(0);
        }
    }

    public ArrayList<String> getCaseList(){
        return cases;
    }
    public ArrayList<String> getDatesList(){
        return dates;
    }

    public void print(){
        //System.out.println("cases: " + Arrays.toString(getCaseList().toArray()));
        System.out.println(">");
    }


    //
    
}