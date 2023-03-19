
import java.util.ArrayList;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorButton extends Canvas {

	private Color color;
	private GraphicsContext gc = getGraphicsContext2D();
	private GraphicsContext outline = getGraphicsContext2D();

	public ColorButton(double width, double height, Color color, Model model, ArrayList<ColorButton> colorButtons) {
		setWidth(width);
		setHeight(height);
		this.color = color;

		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);

		this.setOnMouseClicked(event -> {
			model.setCurrentColor(color);
			for (ColorButton colorButton : colorButtons) {
				colorButton.removeOutline();
			}
			this.setOutline();
		});

	}

	public void setOutline() {
		outline.setFill(Color.BLACK);
		outline.fillRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);
	}

	public void removeOutline() {
		outline.clearRect(0, 0, getWidth(), getHeight());
		gc.setFill(color);
		gc.fillRect(0, 0, getWidth() * 0.90, getHeight() * 0.90);

	}
}