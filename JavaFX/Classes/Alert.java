package Classes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alert {
    public void alertDisplayer(String alertText,String alertTitle){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // Stops the previous window input
        window.setTitle(alertTitle);

        Label label = new Label();
        label.setText(alertText);

        Button button = new Button("OK");
        button.setOnAction(e->{
            window.close();
        });

        VBox vBox = new VBox(15);
        vBox.getChildren().addAll(label,button);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox,300,100);
        
        window.setScene(scene);
        window.showAndWait(); // waits till this window close
    }
}
