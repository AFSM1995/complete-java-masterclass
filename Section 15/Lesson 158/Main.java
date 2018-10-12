// Using Code vs FXML

package sample;

import javafx.application.Application;
import javafx.scene.control.Label; // Important causes error 27,27
import javafx.scene.paint.Color; // Makes color work
import javafx.scene.text.Font; // Makes font work
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

// Using code
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10); // Vertical gap
//        root.setHgap(10); // Horizontal gap
//        Label greeting = new Label("Using code");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
