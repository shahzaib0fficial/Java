package Classes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SuretyChecker {
    boolean surety = false;
    public boolean Check(String title,String notice){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        
        Label label = new Label();
        label.setText(notice);

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e->{
            surety = true;
            window.close();
        });

        Button noButton = new Button("No");
        noButton.setOnAction(e->{
            surety = false;
            window.close();
        });

        VBox vBox = new VBox(15);
        vBox.getChildren().addAll(label,yesButton,noButton);

        Scene scene = new Scene(vBox,200,100);

        window.setScene(scene);
        window.showAndWait();
        return surety;
    }
}