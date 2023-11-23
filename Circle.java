public class Circle implements IShape {
	// Thuoc tinh
	double r;
	final double PI = 3.14;


	// Phuong thuc
	// Ham khoi tao co doi so
	public Circle(double r) {
		this.r = r;
	}
	@Override
	public double calculateArea() {
		return PI * r * r;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * PI * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPi() {
		return PI;
	}


}