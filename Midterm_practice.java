//exam 1 study guide

//openfile method

public static void openFile (Scanner in) throws..{
	Filereader fileReader = null; 	
	"enter valid file name"
	String fileName = in.nextLine();
	File input = new file(fileName);

	if (!input.exists){
		"the file doesnt exist"
	}

	try{
		Scanner inSS = new Scanner(input);
		return inSS;
	}
	catch(Exception e){
		"couldn't open file"
	}

}





//6
public static boolean midPoint( int a , int b , int c ){
	 // find  a + b / 2

	if (a+b/2=c || a+c/2=b || b+c/2=a){
		return true;
	}
	else{
		return false;
	}
}

//4 after 6 	
	//parameter is limit(while sum <= parameter)  declare sum
	// round to decimal point
	//sum = sum + 1/i ;


public static double sequenceLimit(double limit){
	double sum = 1.0;
	System.out.print ("1 +");

	while (sum <= limit){
		sum = sum + (1 / i) ;
		if(i>1){
			System.out.print("1/" + i + "+");
		}

	}
	//if i = 0, print i
	System.out.print("="+sum);
	return sum;

}


//9
public class rectangle {
	private double width, length;

	//rectangle type
	public void rectangleType(double w, double h){
		setDimensions(w,h);
	}

	//getter and setter
	public void setWidth(double width){
		this.width = width ;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}

	// set dimensions
	public void setDimensions(double w, double h){
		setWidth(w);
		setHeight(h);
	}

	//perimeter
	public double getPerimeter(double w, double h){
		double perimeter = 2 * (w +h);
		return perimeter;
	}
	//area
	public double getArea(double w, double h){
		double area = w * h;
	}

	//print all to string
	public String toString(){
		String print = "width =" + getWidth() + "\ngetArea = " + getArea(getWidth(), getHeight()) ;
	}

}


public static void main (String args[]){
		//create object rectangle
		//rectangle = new rectangle(getWidth() , getheight()) ;
		toString();
		//or
		String print = "width =" + getWidth() + "\ngetArea = " + getArea(getWidth(), getHeight()) ;
} 


//10
String[] myArray = new String[10];
Scanner scnr = new Scanner(System.in);
int i = 0;
while(scnr.hasNext()){
	myArray[i] = scnr.next();
	i++
}


//11  --- go over
//this is a read file method
String[] myArray = new String[10];
System.out.println("Please enter valid file name: ");
Scanner scnr = new Scanner(System.in);
int i = 0;
//check if empty
if(!scnr.hasNext()){
	System.out.println("empty file");
	System.exit(0);
}

//populate array
while(scnr.hasNext()){
	myArray[i] = scnr.nextLine();
	i++
//avoid overflow
	if(i = 10){
		break;
		System.out.println("Array full");
	}
}




//8
public class rectangle {
	private int width;
	private int height;
	public static void main(String args[]){

		public rectangle rt = new rectangle();
		rt.setWidth(15);
		rt.setHeight(4);
		System.out.println("width =" + getwidth() +
		 "height= " + getHeight() +
		 "area = " + getArea() +
		 "perimeter = " + getPerimeter()
		 );
	}

	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height ;
	}
	public int getwidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public double getArea(){
		double area = getWidth() * getHeight();
		return area;
	}
	public double getPerimeter(){
		double perimeter = 2 * (getWidth() + getHeight());
		return perimeter;
	}
}


//read data into array

public static void readFile (Scanner scnr) throws IOException{
	String[] arr = new String[10] ; // check if this is how you declare
	int i = 0;
	try{

		while(scnr.hasNext()){
			arr[i] = scnr.nextLine();
			i++;
			//***remember this part
			if(i == arr.length){
				print"array full";
				break;
			}
		}
	}

	catch(ArrayOutOfBoundsException){
		"^"
	}
	catch(Exception e){
	"IO errror"
	System.exit(0);
	}

}

//Lab 8.16 output valuea below an amount
import java.util.Scanner; 
import java.util.Arrays;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

         int index = 0;
        while(scnr.hasNext()){
            userValues[index] = scnr.nextInt();     
            index ++;
        }
        //System.out.println(Arrays.toString(userValues));
        
        int nums = userValues[0] ;
        int limit = userValues[index -1] ;
        
        for(int i = 1 ; i <  index -1 ; i++){
            if(userValues[i] <= limit){
            System.out.print( userValues[i] + " " );
            }
        }
        System.out.print("\n");
   }
}

//expressions, switch, for-each**, do-while, 

switch(a){
	case 0:

		break;

	case 1:

		break;
}

//open a file

public static void openFile (Scanner in )throws IOException{

	FileReader fileReader = null;
	File input;
	String fileName;
	Scanner inSS;
	

	print "enter file name"
	fileName = in.nextLine();
	input = new File(fileName);

	if(!input.exists()){
		"couldnt open file"
		exit;
	}

	try{
		inSS = new Scanner(input);
		return inSS;
	}
	catch(IOException e){
		"IO problems, exit"


	}


}

///labs

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner in = new Scanner(System.in);
      int count = 0;
      String first;
      String sec; 
      String thir; 
      String initial;
      
      while(in.hasNext()){
         count++;  
      }
      if(count == 2){
         first = in.next();
         sec = in.next();  
         initial = first.substring(0,1);
         System.out.println(sec + ", " + initial + ".");
      }
      else if(count == 3){
         first = in.next();
         sec = in.next();
         thir = in.next();
         initial = first.substring(0,1);
         String initial2 = sec.substring(1,2);
         System.out.println(thir + ", " + initial + "." + initial2 + ".");
      }   
      else{
       System.out.println("invalid input");  
      }
      
   }
}























