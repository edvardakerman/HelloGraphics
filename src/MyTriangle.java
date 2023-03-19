import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {

	public MyTriangle(Double x, Double y, Color shapeColor) {
		super(x, y, shapeColor);

	}

	public MyTriangle() {

	}

	public void paintYourself(GraphicsContext context) {
		context.setFill(getColor());
		
		double[] xPoints = new double[3];

		xPoints[0] = (getX() + 15);
		xPoints[1] = (getX() + 30);
		xPoints[2] = getX();

		double[] yPoints = new double[3];
		yPoints[0] = getY();
		yPoints[1] = getY() + 30;
		yPoints[2] = getY() + 30;

		context.fillPolygon(xPoints, yPoints, 3);

	}

}