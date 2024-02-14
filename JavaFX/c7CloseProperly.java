import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class c7CloseProperly extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        window.setTitle("Close Me");
        StackPane layout = new StackPane();

        Button button = new Button("Exit");
        button.setOnAction(e->{
            CloseProgram(layout,button);
        });

        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,200);

        window.setScene(scene);
        window.show();

        window.setOnCloseRequest(e->{
            e.consume();
            CloseProgram(layout, button);
        });
    }

    private void CloseProgram(StackPane layout,Button button){
        layout.getChildren().remove(button);
        Label label = new Label("Saved EveryThing & Program is Closing");
        layout.getChildren().add(label);
        window.close();
    }
}