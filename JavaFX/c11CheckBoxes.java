import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class c11CheckBoxes extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckBox");

        Label label = new Label("Which Language You Know?");

        CheckBox checkBox1 = new CheckBox("Java");
        checkBox1.setSelected(true);
        CheckBox checkBox2 = new CheckBox("C++");

        Button button = new Button("Submit");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        GridPane.setConstraints(label, 0, 0);
        GridPane.setConstraints(checkBox1, 0, 1);
        GridPane.setConstraints(checkBox2, 1, 1);
        GridPane.setConstraints(button, 0, 2);
        gridPane.getChildren().addAll(label,checkBox1,checkBox2,button);

        button.setOnAction(e->{
            gridPane.getChildren().removeAll(label,checkBox1,checkBox2,button);
            String returnedValue = optionHandler(checkBox1,checkBox2);
            Label label2 = new Label(returnedValue);
            GridPane.setConstraints(label2, 0, 0);
            gridPane.getChildren().add(label2);
        });

        Scene scene = new Scene(gridPane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private String optionHandler(CheckBox checkBox1,CheckBox checkBox2){
        String string = "You Knows :";

        if(checkBox1.isSelected()){
            string += " " + checkBox1.getText();
        }
        if(checkBox2.isSelected()){
            string += " " + checkBox2.getText();
        }
        return string;
    }
}
