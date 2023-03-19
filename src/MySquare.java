import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {

	public MySquare(Double x, Double y, Color shapeColor) {
		super(x, y, shapeColor);

	}

	public MySquare() {

	}

	public void paintYourself(GraphicsContext context) {
		context.setFill(getColor());
		context.fillRect(getX() - 15, getY() - 15, 30, 30);

	}

}
