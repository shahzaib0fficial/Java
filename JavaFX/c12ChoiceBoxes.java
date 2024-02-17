import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class c12ChoiceBoxes extends Application {
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ChoiceBoxes");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().add("Java");
        choiceBox.getItems().add("C++");
        choiceBox.getItems().addAll("C","JavaScript");
        choiceBox.setValue("Select");

        Button button = new Button("Submit");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        GridPane.setConstraints(choiceBox, 0, 0);
        GridPane.setConstraints(button, 0, 1);

        gridPane.getChildren().addAll(choiceBox,button);

        button.setOnAction(e->{
            String returnedValue = getChoice(choiceBox);

            Node existNode = gridPane.getChildren().stream()
            .filter(node -> GridPane.getRowIndex(node) == 2 
            && GridPane.getColumnIndex(node) == 0)
            .findFirst().orElse(null);

            if(existNode != null){
                gridPane.getChildren().remove(existNode);
            }

            Label label = new Label(returnedValue);
            GridPane.setConstraints(label, 0, 2);
            gridPane.getChildren().add(label);
        });

        choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)->{
            String returnedValue = getChoice(choiceBox);

            Node existNode = gridPane.getChildren().stream()
            .filter(node -> GridPane.getRowIndex(node) == 2 
            && GridPane.getColumnIndex(node) == 0)
            .findFirst().orElse(null);

            if(existNode != null){
                gridPane.getChildren().remove(existNode);
            }

            Label label = new Label(returnedValue);
            GridPane.setConstraints(label, 0, 2);
            gridPane.getChildren().add(label);
        });

        Scene scene = new Scene(gridPane,300,200);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    private String getChoice(ChoiceBox<String> choiceBox){
        String value = choiceBox.getValue();

        if(value.equals("Select")){
            return "Plese Select";
        }
        else{
            return "wow you select " + value;
        }
    }
}