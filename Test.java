public class Test {
	public static void main(String[] args) {
		// Khai bao doi tuong
		ShapeFactory f = new ShapeFactory();
		IShape randomShap = f.creatShape();
		Circle circle = new Circle(4.5);
		Rectangle rectangle = new Rectangle(12, 7);

		System.out.println("Chu vi hinh tron la: " + circle.calculatePerimeter());
		System.out.println("Dien tich hinh chu nhat la: " + rectangle.calculateArea());
		System.out.println("Dien tich hinh random ra la: " + randomShap.calculateArea());
	}
}
