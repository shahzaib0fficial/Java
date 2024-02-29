import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class c17CSS extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CSS");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Dark","Light","Red","Green","Blue");
        choiceBox.setValue("Dark");
        choiceBox.getStyleClass().add("choiceBox");

        Label label = new Label("Select for Theme");
        label.setStyle("-fx-text-fill : blue");

        Button submit = new Button("Submit");
        submit.setId("submit");
        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        GridPane.setConstraints(label, 0, 0);
        GridPane.setConstraints(choiceBox, 0, 1);
        GridPane.setConstraints(submit, 0, 2);

        gridPane.getChildren().addAll(label,choiceBox,submit);

        Scene scene = new Scene(gridPane,300,200);
        scene.getStylesheets().add("CSS/style.css");
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
