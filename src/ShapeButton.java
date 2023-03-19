
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public abstract class ShapeButton extends Canvas {

	public ShapeButton(double width, double height, Color color) {
		setWidth(width);
		setHeight(height);

	}

	public abstract void setOutline();

	public abstract void removeOutline();
}