import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class c16Menu extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu");

        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("New Text File"));
        fileMenu.getItems().add(new MenuItem("New File..."));
        fileMenu.getItems().add(new MenuItem("New Window"));

        Menu editMenu = new Menu("_Edit");
        MenuItem undoItem = new MenuItem("Undo");
        undoItem.setOnAction(e->{
            System.out.println("Undo SucessFully");
        });
        MenuItem redoItem = new MenuItem("Redo");
        editMenu.getItems().add(new SeparatorMenuItem());
        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        pasteItem.setDisable(true);

        editMenu.getItems().addAll(undoItem,redoItem,cutItem,copyItem,pasteItem);

        Menu helpMenu = new Menu("Help");
        CheckMenuItem hintCheckMenuItem = new CheckMenuItem("Hint");
        hintCheckMenuItem.setOnAction(e->{
            if(hintCheckMenuItem.isSelected()){
                System.out.println("Hint is enabled");
            }
            else{
                System.out.println("Hint is disabled");
            }
        });
        CheckMenuItem autoSaveCheckMenuItem = new CheckMenuItem("Auto Save");
        autoSaveCheckMenuItem.setSelected(true);
        helpMenu.getItems().addAll(hintCheckMenuItem,autoSaveCheckMenuItem);

        Menu difficultyMenu = new Menu("Difficulty");
        ToggleGroup difficultyToggleGroup = new ToggleGroup();
        RadioMenuItem easyRadioMenuItem = new RadioMenuItem("Easy");
        RadioMenuItem mediumRadioMenuItem = new RadioMenuItem("Mediun");
        RadioMenuItem hardRadioMenuItem = new RadioMenuItem("Hard");
        easyRadioMenuItem.setToggleGroup(difficultyToggleGroup);
        mediumRadioMenuItem.setToggleGroup(difficultyToggleGroup);
        hardRadioMenuItem.setToggleGroup(difficultyToggleGroup);
        difficultyMenu.getItems().addAll(easyRadioMenuItem,mediumRadioMenuItem,hardRadioMenuItem);

        MenuBar menu = new MenuBar();
        menu.getMenus().addAll(fileMenu,editMenu,helpMenu,difficultyMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menu);

        Scene scene = new Scene(borderPane,400,300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}