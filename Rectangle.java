public class Rectangle implements IShape {
	// Thuoc tinh
	 double a;
	 double b;

	// Phuong thuc
	// Ham khoi tao co doi so
		public Rectangle(double a, double b) {
			this.a = a;
			this.b = b;
		}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double area() {
		return a*b;
	}

	@Override
	public double perimeter() {
		return (a+ b) * 2;
	}
}