import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class c9GridPane extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Log In");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label userNameLabel = new Label("User Name : ");
        GridPane.setConstraints(userNameLabel, 0, 0);

        TextField userNameField = new TextField("Anonymous");
        GridPane.setConstraints(userNameField, 1, 0);

        Label passwordLabel = new Label("Password : ");
        GridPane.setConstraints(passwordLabel, 0, 1);

        TextField passwordField = new TextField();
        passwordField.setPromptText("password");
        GridPane.setConstraints(passwordField, 1, 1);

        Button button = new Button("Log In");
        GridPane.setConstraints(button, 1, 2);

        gridPane.getChildren().addAll(userNameLabel,userNameField,passwordLabel,passwordField,button);

        Scene scene = new Scene(gridPane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
