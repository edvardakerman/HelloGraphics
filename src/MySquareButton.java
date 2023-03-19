
import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquareButton extends ShapeButton {

	private Color color;
	private GraphicsContext gc = getGraphicsContext2D();
	private GraphicsContext outline = getGraphicsContext2D();

	public MySquareButton(double width, double height, Color color, Model model, ArrayList<ShapeButton> shapeButtons) {
		super(width, height, color);

		setWidth(width);
		setHeight(height);
		this.color = color;

		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);

		this.setOnMouseClicked(event -> {
			model.setCurrentShape(new MySquare());
			for (ShapeButton shapeButton : shapeButtons) {
				shapeButton.removeOutline();
			}
			this.setOutline();
		});

	}

	@Override
	public void setOutline() {
		outline.setFill(Color.BLACK);
		outline.fillRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);
	}

	@Override
	public void removeOutline() {
		outline.clearRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);

	}

}