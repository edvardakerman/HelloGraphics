import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircleButton extends ShapeButton {

	private Color color;
	private GraphicsContext gc = getGraphicsContext2D();
	private GraphicsContext outline = getGraphicsContext2D();

	public MyCircleButton(double width, double height, Color color, Model model, ArrayList<ShapeButton> shapeButtons) {
		super(width, height, color);
		setWidth(width);
		setHeight(height);
		this.color = color;

		gc.setFill(color);
		gc.fillOval(0, 0, getWidth() * 0.90, getHeight() * 0.90);

		this.setOnMouseClicked(event -> {
			model.setCurrentShape(new MyCircle());
			for (ShapeButton shapeButton : shapeButtons) {
				shapeButton.removeOutline();
			}
			this.setOutline();
		});

	}

	@Override
	public void setOutline() {
		outline.setFill(Color.BLACK);
		outline.fillOval(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillOval(0, 0, getWidth() * 0.90, getHeight() * 0.90);
	}

	@Override
	public void removeOutline() {
		outline.clearRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillOval(0, 0, getWidth() * 0.90, getHeight() * 0.90);

	}

}