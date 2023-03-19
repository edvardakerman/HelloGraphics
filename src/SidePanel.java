
import java.util.ArrayList;
import java.util.Collections;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SidePanel extends VBox {

	private ArrayList<ColorButton> colorButtons = new ArrayList<ColorButton>();
	private ArrayList<ShapeButton> shapeButtons = new ArrayList<ShapeButton>();

	public SidePanel(Model model, HBox colorLayout) {
		setHeight(700.0);
		setWidth(50.0);

		VBox vbox = new VBox();
		Text colorTitle = new Text("FÄRG");
		Text shapeTitle = new Text("FORM");
		vbox.setStyle("-fx-background-color:#bcbcbc ");

		ColorButton black = new ColorButton(50.0, 50.0, Color.BLACK, model, colorButtons);
		ColorButton white = new ColorButton(50.0, 50.0, Color.WHITE, model, colorButtons);
		ColorButton red = new ColorButton(50.0, 50.0, Color.RED, model, colorButtons);
		ColorButton orange = new ColorButton(50.0, 50.0, Color.ORANGE, model, colorButtons);
		ColorButton yellow = new ColorButton(50.0, 50.0, Color.YELLOW, model, colorButtons);
		ColorButton green = new ColorButton(50.0, 50.0, Color.GREEN, model, colorButtons);
		ColorButton blue = new ColorButton(50.0, 50.0, Color.BLUE, model, colorButtons);
		ColorButton purple = new ColorButton(50.0, 50.0, Color.PURPLE, model, colorButtons);

		Collections.addAll(colorButtons, black, white, red, orange, yellow, green, blue, purple);

		ShapeButton squareButton = new MySquareButton(40.0, 40.0, Color.GREY, model, shapeButtons);
		ShapeButton circleButton = new MyCircleButton(40.0, 40.0, Color.GREY, model, shapeButtons);
		ShapeButton triangleButton = new MyTriangleButton(40.0, 40.0, Color.GREY, model, shapeButtons);

		Collections.addAll(shapeButtons, squareButton, circleButton, triangleButton);

		vbox.getChildren().addAll(colorTitle, black, white, red, orange, yellow, green, blue, purple, shapeTitle,
				squareButton, circleButton, triangleButton);

		colorLayout.getChildren().add(vbox);
		vbox.setAlignment(Pos.TOP_CENTER);

	}

}
