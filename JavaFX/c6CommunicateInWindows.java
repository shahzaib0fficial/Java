import Classes.SuretyChecker;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class c6CommunicateInWindows extends Application {
    public static void main(String[] args){
        launch(args);
    }   
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Let's Communicate");


        Button button = new Button("Click Me");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        button.setOnAction(e->{
            SuretyChecker suretyChecker = new SuretyChecker();
            boolean surety = suretyChecker.Check("CareFull", "Are You Really Sure???");
            if(surety){
                layout.getChildren().remove(button); // removing Button from Screen
                Label label = new Label("You gave Permission");
                layout.getChildren().add(label);
            }
            else{
                layout.getChildren().remove(button); // removing Button from Screen
                Label label = new Label("You Denied Permission");
                layout.getChildren().add(label);
            }
        });

        Scene scene = new Scene(layout,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
