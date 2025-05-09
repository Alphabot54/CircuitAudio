package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

//https://coolors.co/f1f7ed-243e36-7ca982-e0eec6-c2a83e

public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.web("0xf1f7ed"));
		
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);
		stage.setTitle("Circuit Audio");
		
		
		
		stage.setScene(scene);
		stage.show();
	}
}
