package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    // predefinisanje metode start u klasi Application
    public void start(Stage primaryStage) throws Exception{
        //kreiranje okna u koji se stavlja krug
        Pane pane = new StackPane();

        // kreiranje kruga i unos njegovih svojstava
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5,0.5,0.5,0.1));
        pane.getChildren().add(circle); // dodavanje kruga u okno

        // kreiranje nalepnice i unos njenih svojstava
        Label label = new Label("JavaFX");
        label.setFont(
                Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20)
        );
        pane.getChildren().add(label);

        // kreiranje scene i postavljanje na pozornicu
        Scene scene = new Scene(pane,300,300);
        primaryStage.setTitle("Font Demo"); // Unos naziva pozornice
        primaryStage.setScene(scene);
        primaryStage.show(); // prikaz pozornice

    }


    public static void main(String[] args) {
        launch(args);
    }
}
