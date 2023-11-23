public class Circle implements IShape {
	// Thuoc tinh
	double r;
	double pi=3.14;


	// Phuong thuc
	// Ham khoi tao co doi so
	public Circle(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	@Override
	public double area() {
		return pi * r * r;
	}

	@Override
	public double perimeter() {
		return 2 * pi * r;
	}
}