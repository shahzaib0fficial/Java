import javafx.application.Application;
// import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
// import javafx.event.ActionEvent;

public class c3AnonymousAndLamda extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Anonymous & Lamda");

        Button button = new Button();
        button.setText("Click");
        // // Anonymous way
        // button.setOnAction(new EventHandler<ActionEvent>() {
        // @Override
        // public void handle(ActionEvent event) {
        // System.out.println("Anonymous way");
        // }
        // });
        // Lambda short hand
        button.setOnAction(e -> {
            System.out.println("Lamda Way");
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
