
import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangleButton extends ShapeButton {

	private GraphicsContext gc = getGraphicsContext2D();
	private GraphicsContext outline = getGraphicsContext2D();

	public MyTriangleButton(double width, double height, Color color, Model model,
			ArrayList<ShapeButton> shapeButtons) {
		super(width, height, color);

		setWidth(width);
		setHeight(height);

		gc.setFill(color);
		gc.fillPolygon(new double[] { 18, 38, 2 }, new double[] { 6, 34, 34 }, 3);

		this.setOnMouseClicked(event -> {
			model.setCurrentShape(new MyTriangle());
			for (ShapeButton shapeButton : shapeButtons) {
				shapeButton.removeOutline();
			}
			this.setOutline();
		});

	}

	@Override
	public void setOutline() {
		outline.setStroke(Color.BLACK);
		gc.strokePolygon(new double[] { 18, 38, 2 }, new double[] { 6, 34, 34 }, 3);
		outline.setLineWidth(5);
	}

	@Override
	public void removeOutline() {
		outline.setStroke(Color.web("#bcbcbc"));
		gc.strokePolygon(new double[] { 18, 38, 2 }, new double[] { 6, 34, 34 }, 3);
		outline.setLineWidth(5);

	}

}