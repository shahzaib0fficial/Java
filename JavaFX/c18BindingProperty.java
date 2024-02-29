import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class c18BindingProperty extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Binding Property");
        
        TextField textField = new TextField();
        textField.setMaxWidth(200);
        textField.setPromptText("Enter something...");
        Label label1 = new Label("You Typed : ");
        Label label2 = new Label();
        label2.textProperty().bind(textField.textProperty());

        HBox hBox = new HBox(label1,label2);
        hBox.setAlignment(Pos.CENTER);

        VBox vBox = new VBox(10,textField,hBox);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}