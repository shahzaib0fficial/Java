import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class c2HandleInput extends Application implements EventHandler<ActionEvent> {
    Button button;
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Input handling");

        button = new Button();
        button.setText("Click Me");
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,200);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @Override
    public void handle(ActionEvent event) { // called when any event occurs
        if(event.getSource() == button){ // checking that if the event is occurs matches with the button
            button.setText("Clicked");
        }
    }
}
