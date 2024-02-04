import Classes.Alert;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class c5MultipleWindows extends Application {
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryWindow) throws Exception {
        primaryWindow.setTitle("Alert Opener");

        Button button = new Button("Open");
        button.setOnAction(e->{
            Alert alert = new Alert();
            alert.alertDisplayer("Warning","Alert");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,200);

        primaryWindow.setScene(scene);
        primaryWindow.show();
    }
}