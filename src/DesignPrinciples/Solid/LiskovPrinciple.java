package DesignPrinciples.Solid;

class Rectangle{
	protected double width;
	protected double height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double area() {
		return width*height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
}

class Square extends Rectangle{
	
	public Square(double size) {
		super(size,size);
	}
	
	@ Override
	public void setWidth(double width) {
		this.height = this.width = width;
	}
	
	@ Override
	public void setHeight(double height) {
		this.width = this.height = height;
	}
}

class LiskovPrinciples{
	public static void main(String[] args) {
		Square q = new Square(5);
		System.out.println(q.area());
	}
}