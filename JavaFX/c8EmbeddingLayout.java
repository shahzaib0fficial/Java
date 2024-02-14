import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class c8EmbeddingLayout extends Application {
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Embedding Layout");

        HBox hBox = new HBox();
        Button buttonFile = new Button("File");
        Button buttonEdit = new Button("Edit");
        Button buttonSelection = new Button("Selection");
        hBox.getChildren().addAll(buttonFile,buttonEdit,buttonSelection);

        VBox vBox = new VBox();
        Button buttonExplorer = new Button("Explorer");
        Button buttonSearch = new Button("Search");
        vBox.getChildren().addAll(buttonExplorer,buttonSearch);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setLeft(vBox);

        Scene scene = new Scene(borderPane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}