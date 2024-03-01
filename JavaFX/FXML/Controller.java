import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Controller implements Initializable{
    public Button button;
    
    public void handleButton(){
        button.setText("Clicked");
    }
    @Override
    public void initialize(URL location ,ResourceBundle resources) {
        System.out.println("Loading...");
    }
}