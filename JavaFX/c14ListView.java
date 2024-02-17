import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class c14ListView extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("List View");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Java","C++","C");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);;

        Button button = new Button("Submit");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        GridPane.setConstraints(listView, 0, 0);
        GridPane.setConstraints(button, 0, 1);
        gridPane.getChildren().addAll(listView,button);

        button.setOnAction(e->{
            String message = "";
            ObservableList<String> list = listView.getSelectionModel().getSelectedItems();
            
            if(list.isEmpty()){
                message = "Plese Select";
            }

            for(String l : list){
                message += l + " ";
            }

            Label label = new Label();
            label.setText(message);

            Node existNode = gridPane.getChildren().stream().filter(
                node -> GridPane.getRowIndex(node) == 2 
                && GridPane.getColumnIndex(node) == 0
            ).findFirst().orElse(null);

            if(existNode != null){
                gridPane.getChildren().remove(existNode);
            }

            GridPane.setConstraints(label, 0, 2);
            gridPane.getChildren().add(label);
        });

        Scene scene = new Scene(gridPane,300,200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}