
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {

	private Model model = new Model();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			primaryStage.setTitle("Välkommen till Ritprogrammet!");
			primaryStage.setWidth(1000);
			primaryStage.setHeight(700);

			HBox hb = new HBox();
			VBox vb = new VBox();
			PaintSurface ps = new PaintSurface(model);
			HorizontalPanel bottomPanel = new HorizontalPanel(model, vb, ps);
			SidePanel colors = new SidePanel(model, hb);

			ps.paint(model);
			vb.getChildren().add(ps);
			hb.getChildren().add(vb);
			hb.getChildren().add(colors);
			vb.getChildren().add(bottomPanel);

			Scene mainScene = new Scene(hb);
			primaryStage.setScene(mainScene);
			primaryStage.show();

		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}
