
import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Model {

	private Shape currentShape = new MyCircle(50.0, 50.0, getCurrentColor());
	private Color currentColor = Color.BLACK;
	// Lagrar alla ritade former i contents
	private ArrayList<Shape> contents = new ArrayList<Shape>();

	public ArrayList<Shape> getShape() {
		return contents;
	}

	public Shape getCurrentShape() {
		return currentShape;
	}

	public void setCurrentShape(Shape currentShape) {
		this.currentShape = currentShape;

	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	public void addShape(Double x, Double y) {
		if (getCurrentShape() instanceof MyCircle) {
			currentShape.setX(x);
			currentShape.setY(y);
			this.contents.add(new MyCircle(x, y, getCurrentColor()));
		} else if (getCurrentShape() instanceof MyTriangle) {
			currentShape.setX(x);
			currentShape.setY(y);
			this.contents.add(new MyTriangle(x - 30, y - 30, getCurrentColor()));
		} else if (getCurrentShape() instanceof MySquare) {
			currentShape.setX(x);
			currentShape.setY(y);
			this.contents.add(new MySquare(x, y, getCurrentColor()));
		}
		System.out.println(getShape());
	}
	
	public void drawYourself(double x, double y, GraphicsContext context) {
		for (Shape currentShape : this.getShape()) {
			currentShape.paintYourself(context);
		}
	}

	public void clear() {
		contents.clear();
	}
}
