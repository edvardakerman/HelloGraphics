
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HorizontalPanel extends HBox {

	public HorizontalPanel(Model model, VBox paintLayout, Canvas paintSurface) {

		GraphicsContext gc = paintSurface.getGraphicsContext2D();

		HBox hbox = new HBox();
		Button clearButton = new Button("rensa");

		setHeight(50);
		setWidth(500);

		hbox.getChildren().add(clearButton);
		paintLayout.getChildren().add(hbox);
		hbox.setAlignment(Pos.BASELINE_LEFT);
		hbox.setStyle("-fx-background-color:#bcbcbc ");

		clearButton.setMaxSize(80, 50);
		clearButton.setMinSize(80, 50);

		clearButton.setOnAction(actionEvent -> {
			model.clear();
			gc.clearRect(0, 0, paintSurface.getWidth(), paintSurface.getHeight());
			gc.setFill(Color.WHITE);

		});

	}
}
