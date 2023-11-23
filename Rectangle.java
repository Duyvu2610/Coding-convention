public class Rectangle implements IShape {
	// Thuoc tinh
	 double height;
	 double width;

	// Phuong thuc
	// Ham khoi tao co doi so
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}

	@Override
	public double calculatePerimeter() {
		return (height + width) * 2;
	}
}