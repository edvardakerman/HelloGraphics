
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PaintSurface extends Canvas {

	private Model model;

	public PaintSurface(Model model) {
		this.model = model;

		// Höjd och bakgrundsfärg på canvas
		this.setWidth(1000);
		this.setHeight(700);
		
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void paint(Model model) {
		GraphicsContext canvas = this.getGraphicsContext2D();
		canvas.setFill(Color.WHITE); // vilken färg canvasen ska ha
		canvas.fillRect(0, 0, getWidth(), getHeight());

		// Vi kan säga vad som ska hända när vi klickar i vårt canvas.
		setOnMouseClicked(event -> {
			model.addShape(event.getX(), event.getY());
			model.drawYourself(event.getX(), event.getY(), canvas);

		});
	}

}
