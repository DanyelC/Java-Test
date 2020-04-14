package entities;

public class Rect {
	public double Width;
	public double Height;
	
	public double area() {
		return Width*Height;
	}
	public double perimeter(){
		return (Width + Height)*2;
	}
	public double diagonal(){
		return Math.sqrt((Height*Height+Width*Width));
	}


}
