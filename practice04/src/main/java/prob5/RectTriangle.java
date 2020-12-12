package prob5;

public class RectTriangle extends Shape {
	double height;
	double width;
	
	@Override
	double getArea() {
		return (height * width) / 2;
	}

	@Override
	double getPerimeter() {
		return height + width + Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)); 
	}

	public RectTriangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
}
