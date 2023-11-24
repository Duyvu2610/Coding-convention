import java.util.Random;

public class ShapeFactory {
	Random random = new Random();

	public IShape creatShape() {
		int randomNumber= random.nextInt(100);
		if (randomNumber >= 30 && randomNumber < 60) {
			return new Rectangle(random.nextDouble(10), random.nextDouble(10));
		} else {
			return new Circle(random.nextDouble(10));
		}

	}

}
