import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class c1BasicWindow extends Application { // extend calss with Application so we can use things is defined in Application class
    Button button; // creating an instance of button gloabally so we can use anywhere in our program
    public static void main(String args[]){
        launch(args); // launch our start function
    }
    @Override
    public void start(Stage primaryStage) throws Exception{ // function where we setted up our windows(gui), primary stage is the whole window
        primaryStage.setTitle("Title of App"); // title is shown in our head
        
        button = new Button(); // creates a new button
        button.setText("Click Me"); // set text shown inside the button

        StackPane layout = new StackPane(); // layout is a container holding all components
        layout.getChildren().add(button); // adding button component in layout

        Scene scene = new Scene(layout,300,200); // create new scene in which layout is displayed and specifying the width then height(for initially open)
        primaryStage.setScene(scene); // setting scence 
        primaryStage.show();
    }
}
