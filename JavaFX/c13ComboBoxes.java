import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class c13ComboBoxes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Combo Boxes");

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Java", "C++", "C");
        // comboBox.setValue("Select");
        comboBox.setEditable(true);

        Button button = new Button("Submit");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        GridPane.setConstraints(comboBox, 0, 0);
        GridPane.setConstraints(button, 0, 1);
        gridPane.getChildren().addAll(comboBox, button);

        button.setOnAction(e -> {
            getChoice(comboBox, gridPane);
        });

        Scene scene = new Scene(gridPane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getChoice(ComboBox<String> comboBox, GridPane gridPane) {
        Label label = new Label();
        if (comboBox.getValue().equals("")) {
            label.setText("Please Select");
        } else {
            label.setText("Your Choice : " + comboBox.getValue());
        }

        Node existNode = gridPane.getChildren().stream()
                .filter(node -> GridPane.getRowIndex(node) == 2
                        && GridPane.getColumnIndex(node) == 0)
                .findFirst().orElse(null);

        if (existNode != null) {
            gridPane.getChildren().remove(existNode);
        }
        
        GridPane.setConstraints(label, 0, 2);
        gridPane.getChildren().add(label);
    }
}
