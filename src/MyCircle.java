import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends Shape {

	public MyCircle(Double x, Double y, Color shapeColor) {
		super(x, y, shapeColor);

	}

	public MyCircle() {

	}

	public void paintYourself(GraphicsContext context) {
		context.setFill(getColor());
		context.fillOval(getX() - 15, getY() - 15, 30, 30);

	}

}
