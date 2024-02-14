import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class c10ExtractAndValidateInput extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Extract And Validator");

        Label label = new Label("Enter Age : ");

        TextField textField = new TextField();

        GridPane gridPane = new GridPane();
        
        Button button = new Button("Submit");
        button.setOnAction(e->{
            Label printLabel;
            int age = intValidator(textField, textField.getText());
            if(age > 0){
                printLabel = new Label("You are "+age+" Year old");
            }else{
                printLabel = new Label("Invalid Input");
            }

            Node existNode = gridPane.getChildren().stream()
            .filter(node->GridPane.getRowIndex(node)!=null && 
            GridPane.getRowIndex(node)==2 && GridPane.getColumnIndex(node)!=null
            && GridPane.getColumnIndex(node)==1).findFirst().orElse(null);

            if(existNode!=null){
                gridPane.getChildren().remove(existNode);
            }

            GridPane.setConstraints(printLabel, 1, 2);
            gridPane.getChildren().add(printLabel);
        });

        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);

        GridPane.setConstraints(label, 0, 0);
        GridPane.setConstraints(textField, 1, 0);
        GridPane.setMargin(button, new Insets(10,0,0,0));
        GridPane.setConstraints(button, 1, 1);

        gridPane.getChildren().addAll(label,textField,button);

        Scene scene = new Scene(gridPane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private int intValidator(TextField textField,String value){
        try{
            int age = Integer.parseInt(textField.getText());
            return age;
        }catch(NumberFormatException e){
            return 0;
        }
    }
}