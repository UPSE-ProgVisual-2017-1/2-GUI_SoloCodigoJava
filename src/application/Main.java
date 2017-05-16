package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			VBox cajaVertical = new VBox();
			root.getChildren().add(cajaVertical);
			
			HBox cajaHorizontal = new HBox();
			Button btnSaludar = new Button("Saludar");
			
			cajaVertical.getChildren().add(cajaHorizontal);
			cajaVertical.getChildren().add(btnSaludar);
			
			Label lblNombre = new Label("Pon tu nombre: ");
			TextField txtNombre = new TextField();
			
			cajaHorizontal.getChildren().add(lblNombre);
			cajaHorizontal.getChildren().add(txtNombre);
			
			btnSaludar.setOnAction( e -> System.out.println("Hola " + txtNombre.getText()));
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
