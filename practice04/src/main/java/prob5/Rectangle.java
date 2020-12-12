package prob5;

public class Rectangle extends Shape implements Resizable {
	double height;
	double width;
	
	@Override
	double getArea() {
		return height * width;
	}

	@Override
	double getPerimeter() {
		return (height + width) * 2;
	}

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void resize(double s) {
		height = height * s;
		width = width * s;
	}
}
