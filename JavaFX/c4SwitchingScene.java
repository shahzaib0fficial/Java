import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class c4SwitchingScene extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Go Next");

        Label label = new Label("I am a Label"); // use to display text/label on window

        VBox vBox = new VBox(10); // it set up and down elements , 10 is the space between elements
        Scene scene1 = new Scene(vBox,300,200);

        Button button2 = new Button("Back");
        button2.setOnAction(e->{
            primaryStage.setTitle("Go Next");
            primaryStage.setScene(scene1); // switch scene to scene1
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button2);
        Scene scene2 = new Scene(layout,500,500);
        
        Button button1 = new Button();
        button1.setText("Next");
        button1.setOnAction(e->{
            primaryStage.setTitle("Go Back");
            primaryStage.setScene(scene2); // switch scene to scene2
        });

        vBox.getChildren().addAll(label,button1); // addAll() used to add muliple elements

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
