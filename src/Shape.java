import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {

	private Double x;
	private Double y;
	private Color shapeColor;

	public Shape(Double x, Double y, Color color) {
		this.x = x;
		this.y = y;
		this.shapeColor = color;
	}

	public Shape() {

	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Color getColor() {
		return shapeColor;
	}

	public void setColor(Color currentColor) {
		this.shapeColor = currentColor;
	}

	protected abstract void paintYourself(GraphicsContext context);

}
