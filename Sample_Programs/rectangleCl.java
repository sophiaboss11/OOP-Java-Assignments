public class rectangleCl {
	private int width;
	private int height;
	public static void main(String args[]){

		rectangle rt = new rectangle();
		rt.setWidth(15);
		rt.setHeight(4);
		System.out.println("width =" + rt.getwidth() +
		 "height= " + rt.getHeight() +
		 "area = " + rt.getArea() +
		 "perimeter = " + rt.getPerimeter()
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